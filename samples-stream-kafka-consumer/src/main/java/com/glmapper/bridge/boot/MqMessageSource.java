package com.glmapper.bridge.boot;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author: guolei.sgl (gkmaper_2018@163.com) 2019/5/16 4:53 PM
 * @since:
 **/
public interface MqMessageSource {
    String TEST_IN_PUT = "testInPut";

    @Input(TEST_IN_PUT)
    SubscribableChannel testInPut();
}
