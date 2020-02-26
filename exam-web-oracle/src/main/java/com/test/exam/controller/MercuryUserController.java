package com.test.exam.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.exam.domain.MercuryAction;
import com.test.exam.domain.MercuryUser;
import com.test.exam.domain.UIResult;
import com.test.exam.service.MercuryUserService;
import com.test.exam.util.CommonUtil;

@RestController  //实现 Restful HTTP 服务
public class MercuryUserController {
    
    @Autowired
    private MercuryUserService mercuryUserService;
    
    @RequestMapping(value = "/mercuryUser/getAllUsers")
    public UIResult getAllUsers(HttpServletRequest request){
        UIResult uiResult = new UIResult();
        List<MercuryUser> users = mercuryUserService.getAllUsers();
        uiResult.setResult(users);
        return uiResult;
    }
    
    @RequestMapping(value="/mercuryUser/insert")
    public UIResult insertMercury(
            @RequestParam(value="userId", required=false)Integer userId,
            @RequestParam(value="userName", required=false)String userName,
            @RequestParam(value="status", required=false)String status,
            @RequestParam(value="isAdmin", required=false)String isAdmin,
            @RequestParam(value="name", required=false)String name,
            @RequestParam(value="password", required=false)String password,
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        MercuryUser newUser = copyUser(userId,userName,status,isAdmin,name,password);
        mercuryUserService.insert(newUser);
        uiResult.setResult(newUser);
        return uiResult;
    }
    
    @RequestMapping(value="/dubbo/insert")
    public UIResult dubboinsertMercury(
            @RequestParam(value="userId", required=false)Integer userId,
            @RequestParam(value="userName", required=false)String userName,
            @RequestParam(value="status", required=false)String status,
            @RequestParam(value="isAdmin", required=false)String isAdmin,
            @RequestParam(value="name", required=false)String name,
            @RequestParam(value="password", required=false)String password,
            HttpServletRequest request) throws Exception{
        UIResult uiResult = new UIResult();
        MercuryUser newUser = copyUser(userId,userName,status,isAdmin,name,password);
        newUser = mercuryUserService.dubboInsert(newUser);
        uiResult.setResult(newUser);
        return uiResult;
    }
    
    
    private MercuryUser copyUser(Integer userId, String userName, String status, String isAdmin, String name,
            String password) {
        MercuryUser newUser = new MercuryUser();
        newUser.setUserId(userId);
        newUser.setUserName(userName);
        newUser.setStatus(status);
        newUser.setAddedBy("小明");
        newUser.setUpdatedBy("小明");
        newUser.setAddedDate(CommonUtil.getTime(null));
        newUser.setUpdatedDate(CommonUtil.getTime(null));
        newUser.setIsAdmin(isAdmin);
        newUser.setName("明明");
        newUser.setPassword(password);
        return newUser;
    }


//    @Autowired
//   private MercuryActionDao mercuryActionDao;
    
    @RequestMapping(value="/mercuryAction/getAll")
    public UIResult getAllActions(){
        UIResult uiResult = new UIResult();
//        List<MercuryAction> actions = mercuryActionDao.getAll();
        uiResult.setResult(null);
        return uiResult;
    }
    
    
}
