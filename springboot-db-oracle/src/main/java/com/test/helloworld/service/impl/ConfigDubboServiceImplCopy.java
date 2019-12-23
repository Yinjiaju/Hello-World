package com.test.helloworld.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Service;

import com.test.helloworld.domain.MercuryUser;
import com.test.helloworld.service.ConfigDubboService;
import com.test.helloworld.service.MercuryUserService;
@Service(value="ConfigDubboServiceCopy")
@Component
public class ConfigDubboServiceImplCopy implements ConfigDubboService {
    
    @Autowired
    private MercuryUserService mercuryUserService;
    
    @Override
    public MercuryUser add(MercuryUser user) {
        // TODO Auto-generated method stub
        try {
            System.err.println("================ConfigDubboServiceCopy");
            mercuryUserService.insert(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }

}
