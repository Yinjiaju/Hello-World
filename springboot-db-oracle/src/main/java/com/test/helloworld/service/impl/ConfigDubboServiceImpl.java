package com.test.helloworld.service.impl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.Main;
import com.test.helloworld.domain.MercuryUser;
import com.test.helloworld.service.ConfigDubboService;
import com.test.helloworld.service.MercuryUserService;
@Service(value="ConfigDubboService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class ConfigDubboServiceImpl implements ConfigDubboService {
    
    @Autowired
    private MercuryUserService mercuryUserService;
    
    @Override
    public MercuryUser add(MercuryUser user) {
        // TODO Auto-generated method stub
        try {
            System.err.println("================ConfigDubboService");
            byte[] bys = new byte[10];
            Base64.getDecoder().decode(bys);
            
            mercuryUserService.insert(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }
    
    

}
