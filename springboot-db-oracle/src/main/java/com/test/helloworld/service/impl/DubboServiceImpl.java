package com.test.helloworld.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





import com.alibaba.dubbo.config.annotation.Service;
import com.test.helloworld.domain.MercuryUser;
import com.test.helloworld.service.DubboService;
import com.test.helloworld.service.MercuryUserService;
@Service(version="dubboService")   //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class DubboServiceImpl implements DubboService {
    
    @Autowired
    private MercuryUserService mercuryUserService;
    
    @Override
    public MercuryUser add(MercuryUser user) {
        // TODO Auto-generated method stub
        try {
            System.err.println("================dubboService");
            mercuryUserService.insert(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }

}
