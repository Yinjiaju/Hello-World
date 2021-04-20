package com.test.exam.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String DATE_FORMAT_6 = "yyMMdd";

    public static final String DATE_FORMAT_8 = "yyyyMMdd";
    
    public static final String DATE_FORMAT_10 = "yyyy-MM-dd" ;
    
    public static final String DATE_FORMAT_14 = "yyyyMMddHHmmss";
    
    
    public static String format(Date date){
        return format(date,DATE_FORMAT_14);
    }


    private static String format(Date date, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        return format.format(date);
    }

    
    
}
