package com.test.exam.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.exam.dao.MercuryUserDao;
import com.test.exam.domain.MercuryUser;
import com.test.exam.service.BaseService;
import com.test.exam.service.MercuryUserService;

@Service
public class MercuryUserServiceImpl extends BaseService implements MercuryUserService {
    
    
    @Autowired
    private MercuryUserDao mercuryUserDao;

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

}
