package com.test.exam.dao;

import java.util.List;

import com.test.exam.domain.MercuryUser;


public interface MercuryUserDao {

    List<MercuryUser> getAllUsers();
    
    int insert(MercuryUser user);

    int insertUserBak(MercuryUser user);
}
