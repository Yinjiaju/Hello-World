package com.test.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;








import com.alibaba.dubbo.config.annotation.Service;
import com.test.exam.domain.MercuryUser;
import com.test.exam.service.DubboService;
import com.test.exam.service.MercuryUserService;

@Service(version="dubboServiceCopy")  //属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Component
public class DubboServiceImplCopy implements DubboService {
    
    @Autowired
    private MercuryUserService mercuryUserService;
    
    @Override
    public MercuryUser add(MercuryUser user) {
        // TODO Auto-generated method stub
        try {
            System.err.println("================dubboServiceCopy");
            mercuryUserService.insert(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return user;
    }

}
