package com.test.exam.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javassist.bytecode.analysis.MultiArrayType;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.test.exam.domain.UIResult;
import com.test.exam.service.UIExamTitleService;
import com.test.exam.util.ImportExecl;

@RestController
// 实现 Restful HTTP 服务
public class UIExamTitleController {

    @Autowired
    private UIExamTitleService uiExamTitleService;

    @RequestMapping(value = "/examTitle/insertExamTitle")
    public UIResult insertExamTitle(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/insertExamTitleList")
    public UIResult insertExamTitleList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/updateExamTitle")
    public UIResult updateExamTitle(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/updateExamTitleList")
    public UIResult updateExamTitleList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/getExamTitleIDSEQ")
    public UIResult getExamTitleIDSEQ(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/getExamTitle")
    public UIResult getExamTitle(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/getExamTitleList")
    public UIResult getExamTitleList(HttpServletRequest request) throws Exception {
        UIResult uiResult = new UIResult();
        return uiResult;
    }

    @RequestMapping(value = "/examTitle/downExamTemplate")
    public ResponseEntity<byte[]> downExamTemplate(
            @RequestParam(value = "name", required = false) String name, HttpServletRequest request)
            throws Exception {
        try {
            String path = this.getClass().getClassLoader().getResource(name).getPath();
            File file = new File(URLDecoder.decode(path, "utf-8"));
            HttpHeaders headers = new HttpHeaders();
            String fileName = new String(name.getBytes("UTF-8"), "is0-8859-1");// 解决中文乱码问
            headers.setContentDispositionFormData("attachement", fileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers,
                    HttpStatus.CREATED);
        } catch (IOException e) {
            return null;
        }

    }

    @RequestMapping(value = "/examTitle/uploadExamTitle")
    public UIResult uploadExamTitle(@RequestParam(value = "file", required = true) MultipartFile file,
            HttpServletRequest request) throws Exception {
        String fileName = file.getOriginalFilename();
        if(fileName.contains(".")){
            String[] a = fileName.split("\\.");
            String b = a[a.length-1];
            if(!b.equals("xls")&& !b.equals("xlsx")&&!b.equals("xlsm")){
                   
                return null;
            }
            
            //解析file文件
            ImportExecl poi = new ImportExecl();
            List<List<String>> list = poi.read(file);
            //下一步进行封装数据
        }
        UIResult uiResult = new UIResult();
        return uiResult;
    }
}
