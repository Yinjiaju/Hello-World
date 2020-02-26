package com.test.exam.service;

import java.util.List;

import com.test.exam.domain.MercuryUser;




public interface MercuryUserService {

    List<MercuryUser> getAllUsers();
    
    void insert(MercuryUser newUser) throws Exception ;
}
