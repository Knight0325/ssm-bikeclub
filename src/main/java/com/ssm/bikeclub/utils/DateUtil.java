package com.ssm.bikeclub.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class DateUtil {

    /**
     * 格式化date
     *
     * @param date
     * @return
     */
    public static String getDateString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }
}
