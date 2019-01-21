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
public class MyLogger {

    public static final String FQCN = MyLogger.class.getName();

    private static final Logger logger = LoggerFactory.getLogger(MyLogger.class);

    private static LocationAwareLogger log;

    static {
        log = (LocationAwareLogger) logger;
    }

    public static void debug(String msg) {
        log.log(null, FQCN, LocationAwareLogger.DEBUG_INT, msg, null, null);
    }


}
