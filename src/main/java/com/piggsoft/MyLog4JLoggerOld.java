package com.piggsoft;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2019/01/21
 * @since 1.0
 */
public class MyLog4JLoggerOld {
    public static final Logger logger = LogManager.getLogger(MyLog4JLoggerOld.class);


    public static void info(String msg) {
        logger.log(Level.INFO, msg, null);
    }

}
