package com.test.helloworld.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.helloworld.dao.MercuryUserDao;
import com.test.helloworld.domain.MercuryUser;
import com.test.helloworld.service.BaseService;
import com.test.helloworld.service.ConfigDubboService;
import com.test.helloworld.service.DubboService;
import com.test.helloworld.service.MercuryUserService;

@Service
@Component
public class MercuryUserServiceImpl extends BaseService implements MercuryUserService {
    
    
    @Autowired
    private MercuryUserDao mercuryUserDao;

    @Reference(timeout=1800000,version="dubboService",check=false)
    private DubboService dubboService;
    
    @Reference(version="ConfigDubboServiceCopy",timeout=1800000,check=false)
    private ConfigDubboService dubboServiceConfig;
    //@Autowired
    //private ConfigDubboService dubboServiceConfig;
    
    @Resource(name="ConfigDubboServiceRefer")
    private ConfigDubboService dubboServiceConfig2;
    @Resource(name="ConfigDubboServiceCopyRefer")
    private ConfigDubboService dubboServiceConfig3;
    
    @Override
    public List<MercuryUser> getAllUsers() {
        return mercuryUserDao.getAllUsers();
    }

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void insert(MercuryUser user) throws Exception {
        try {
            mercuryUserDao.insert(user);
            //System.err.println(1 / 0);
            mercuryUserDao.insertUserBak(user);
        } catch (Exception e) {
            logger.info(e.getMessage());
            throw e;
        }
    }

    @Override
    public MercuryUser dubboInsert(MercuryUser newUser) throws Exception {
        //return dubboService.add(newUser);
        dubboServiceConfig2.add(newUser);
        dubboServiceConfig3.add(newUser);
        return dubboServiceConfig2.add(newUser);
    }

}
