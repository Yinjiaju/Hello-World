package com.test.exam.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    public static <T> Logger getLogger(Class<T> clazz){
        return LoggerFactory.getLogger(clazz);
    }
    
}
