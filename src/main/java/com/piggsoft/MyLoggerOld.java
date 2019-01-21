package com.piggsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2019/01/21
 * @since 1.0
 */
public class MyLoggerOld {


    private static final Logger logger = LoggerFactory.getLogger(MyLoggerOld.class);



    public static void debug(String msg) {
        logger.debug(msg);
    }


}
