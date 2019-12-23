package com.test.helloworld.dao;

import java.util.List;

import com.test.helloworld.domain.MercuryUser;



public interface MercuryUserDao {

    List<MercuryUser> getAllUsers();
    
    int insert(MercuryUser user);

    int insertUserBak(MercuryUser user);
}
