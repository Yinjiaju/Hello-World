package com.test.exam.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class BaseService {
    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());
}
