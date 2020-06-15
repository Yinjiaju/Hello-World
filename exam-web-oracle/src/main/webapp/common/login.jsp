<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String Context = request.getContextPath();
%>
<c:set var="context"  value="<%=Context%>"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<jsp:include page="/commons/common-js.jsp"></jsp:include>
</head>
<body style="background-color: #F3F3F3">
	<form action="/user/login" method="post" id="lognForm">
    <div class="easyui-dialog" title="用户登录" data-options="closable:false,draggable:false" style="width:400px;height:300px;padding:10px;">
       	<div style="margin-left: 50px;margin-top: 50px;">
       		<div style="margin-bottom:20px;">
	            <div>
	            	用户名: <input name="username" class="easyui-textbox" data-options="required:true" style="width:200px;height:32px" value=""/>
	            </div>
	        </div>
	        <div style="margin-bottom:20px">
	            <div>
	            	密&nbsp;&nbsp;码: <input name="password" class="easyui-textbox" type="password" style="width:200px;height:32px" data-options="" value=""/>
	            </div>
	        </div>
	        <div>
	            <a id="login" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:32px;margin-left: 50px">登录</a>
	        </div>
       	</div>
    </div>
    </form>
    <script type="text/javascript">
    	$("#login").click(function(){
    		/* var username = $("[name=username]").val();
    		var password = $("[name=password]").val();
    		
    		if(username!="admin" || password!="admin"){
    			$.messager.alert('错误',"用户名密码不正确！");
    			return ;
    		} */
    		var username = $("[name=username]").val();
    		var password = $("[name=password]").val();
    		$.ajax({
    			url: "${context}/user/login",
    			type: "post",
    			data: {"username":username,"password":password},
    			dataType: "json",
    			success: function(data) {
    				if(data && data.result == "SUCCESS") {
    					alert("登录成功");
    					//try {
    						location.href="${context}/home/show";
    					//} catch (e) {
    					//	location.href = "${context}/home/login";
    					//}
    				} else if(data && data.result == "ERROR" && data.message) {
    					//$("#msg_p").text(data.message);
    					alert(data.message);
    				}
    			}
    		});
    	});
    </script>
</body>
</html>