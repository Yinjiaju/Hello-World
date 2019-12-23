package com.test.helloworld.service;

import java.util.List;

import com.test.helloworld.domain.MercuryUser;




public interface MercuryUserService {

    List<MercuryUser> getAllUsers();
    
    void insert(MercuryUser newUser) throws Exception ;
}
