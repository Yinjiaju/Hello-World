package com.test.exam.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.rmi.server.ExportException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HttpUtils {
	private static Logger logger = LogUtil.getLogger(HttpUtils.class);
	
	private static Gson gson = new Gson();
	private static HttpClientContext context = null;
	private static final int HTTP_STATUS_OK = 200;
	private static final int HTTP_STATUS_UNAUTHORIZED = 401;
	
	
	/********************httpclient***************/
	public static String get(String url) throws Exception{
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse res = null;
		String result = null;
		try {
			res = client.execute(httpget,getContext());
			if(HTTP_STATUS_OK==res.getStatusLine().getStatusCode()) {
				//获取返回结果集
				result = EntityUtils.toString(res.getEntity(), Consts.UTF_8);
			}else {
				throw new Exception("fail get httpclient"+res.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	private static HttpContext getContext() {
		if(context==null) {
			context = HttpClientContext.create();
		}
		return context;
	}

	public static String sendPostMethod(String url,Map<String,Object> paramMap,String encoding) {
		String result = null;
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		//add param
		if(paramMap!=null&&paramMap.size()>0) {
			List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
			for (Map.Entry<String, Object> key : paramMap.entrySet()) {
				String name = key.getKey();
				String value = key.getValue().toString();
				BasicNameValuePair pair = new BasicNameValuePair(name, value);
				parameters.add(pair);
			}
			UrlEncodedFormEntity encodeEntity = null;
			try {
				encodeEntity = new UrlEncodedFormEntity(parameters,"UTF-8");
			} catch (UnsupportedEncodingException e) {
			}
			post.setEntity(encodeEntity);
		}
		try {
			HttpResponse res = client.execute(post);
			if(HTTP_STATUS_OK==res.getStatusLine().getStatusCode()) {
				//获取返回结果集
				result = EntityUtils.toString(res.getEntity(), Consts.UTF_8);
			}else {
				throw new Exception("fail get httpclient"+res.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	
	
	
	
	/**======================================SSL 协议=================================**/
	/**
	 * 
	 * @param url   https://xxxx
	 * @param paramMap  参数 集合
	 * @param encodeing  UTF-8
	 * @param params   拼接在url后的参数
	 * @return
	 */
	public static Map<String,String> setGetMethodClient(String url,Map<String,Object> paramMap,String encodeing,String params){
		
		Map<String,String> resultMap = new HashMap<String,String>();
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(new TrustStrategy() {
				
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			}).build();
			
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
					sslcontext,
					new String[] {"TLSv1"},
					null,
					SSLConnectionSocketFactory.getDefaultHostnameVerifier()
					);
			
			httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();
			String tokenStr = paramMap.get("token").toString();
			String handerValue = "Bearer "+tokenStr;
			url+=((-1==url.indexOf("?"))? "?":"&")+params;
			HttpGet get = new HttpGet(url);
			get.addHeader("Authorization", handerValue);
			response = httpClient.execute(get);
			
			resultMap.put("status", String.valueOf(response.getStatusLine().getStatusCode()));
			if(HTTP_STATUS_OK==response.getStatusLine().getStatusCode()) {
				//获取返回结果集
				String resultGson = EntityUtils.toString(response.getEntity(), encodeing);
				resultMap.put("result", resultGson);
				
				//TODO 解析结果
				//Map<String,String> resMap1 = gson.fromJson(resultGson,new TypeToken<Map<String,String>>() {}.getType());
				//String tokenStr1 = resMap1.get("access_token");
				//================
				//Map<String,Object> resMap = gson.fromJson(resultGson, new TypeToken<Object>() {}.getType());
				//if(resMap.containsKey("data")&&resMap.get("data")!=null) {
				//	Map<String,Object> recordsMap = (Map<String, Object>) resMap.get("data");
				//	if(recordsMap.containsKey("records")&&recordsMap.get("records")!=null) {
				//		List<Map<String,Object>> listMap = (List<Map<String, Object>>) recordsMap.get("records");
				//	}
				//}
			}else {
				throw new Exception("fail get httpclient"+response.toString());
			}
			
		} catch (Exception e) {
			logger.error("fail get httpclient",e);
		}finally {
			try {
				if(response!=null) {
					response.close();
				}
				httpClient.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
		}
		return resultMap;
	}
	
	public static Map<String,String> setPostMethodForClient(String tokenUrl,Map<String,Object> paramMap,String encoding) {
		Map<String,String> resultMap = new HashMap<String, String>();
		CloseableHttpResponse response = null;
		CloseableHttpClient httpClient = null;
		try {
			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(new TrustStrategy() {
				
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			}).build();
			
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(
					sslContext,
					new String[] {"TLSv1"},
					null,
					SSLConnectionSocketFactory.getDefaultHostnameVerifier()
					);
			
			httpClient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory).build();
			String clientName = paramMap.get("clientName").toString();
			paramMap.remove("clientName");
			String clientPassword = paramMap.get("clientPassword").toString();
			paramMap.remove("clientPassword");
			String userPasswordStr = clientName+":"+clientPassword;
			Base64.Encoder encoder = Base64.getEncoder();
			byte[] textByte = new byte[0];
			textByte = userPasswordStr.getBytes("UTF-8");
			String encodedText = encoder.encodeToString(textByte);
			String handerValue ="Basic "+encodedText;
			HttpPost post = new HttpPost(tokenUrl);
			
			//封装表单
			if(paramMap!=null&&paramMap.size()>0) {
				List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
				for (Map.Entry<String, Object> key : paramMap.entrySet()) {
					String name = key.getKey();
					String value = key.getValue().toString();
					BasicNameValuePair pair = new BasicNameValuePair(name, value);
					parameters.add(pair);
				}
				UrlEncodedFormEntity encodeEntity = new UrlEncodedFormEntity(parameters,"UTF-8");
				post.setEntity(encodeEntity);
			}
			post.addHeader("Authorization",handerValue);
			response = httpClient.execute(post);
			resultMap.put("status", String.valueOf(response.getStatusLine().getStatusCode()));
			if(HTTP_STATUS_OK==response.getStatusLine().getStatusCode()) {
				//获取返回结果集
				String resultGson = EntityUtils.toString(response.getEntity(), encoding);
				resultMap.put("result", resultGson);
				
			}else {
				throw new Exception("fail get httpclient"+response.toString());
			}
			
		} catch (Exception e) {
			logger.error("fail get httpclient",e);
		} finally {
			try {
				if(response!=null) {
					response.close();
				}
				httpClient.close();
			} catch (IOException e) {
				logger.error(e.getMessage(),e);
			}
		}
		return resultMap;
	}
	
	
	
}
