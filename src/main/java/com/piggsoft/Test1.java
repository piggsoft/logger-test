package com.piggsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author piggsoft
 * @version 1.0
 * @create 2019/01/21
 * @since 1.0
 */
public class Test1 {
    public static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        LOGGER.debug("this is a message");
        MyLogger.debug("this is test message");
    }

}
