package com.test.exam.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
    public static String getTime(Date time){
        String timeStr = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        if(time!=null){
            timeStr =sdf.format(time);
        }else{
            timeStr=sdf.format(new Date());
        }
        return timeStr;
    }
    
}
