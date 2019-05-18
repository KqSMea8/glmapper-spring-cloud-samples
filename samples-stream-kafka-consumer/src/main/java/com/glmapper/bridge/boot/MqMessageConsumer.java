package com.glmapper.bridge.boot;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @author: guolei.sgl (gkmaper_2018@163.com) 2019/5/16 4:53 PM
 * @since:
 **/
@EnableBinding(MqMessageSource.class)
public class MqMessageConsumer {
    @StreamListener(MqMessageSource.TEST_IN_PUT)
    public void messageInPut(Message<String> message) {
        System.err.println(" 消息接收成功：" + message.getPayload());
    }
}
