package com.glmapper.bridge.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 *
 *
 *
 * @author: guolei.sgl (gkmaper_2018@163.com) 2019/5/16 4:32 PM
 * @since:
 **/
@EnableBinding(MqMessageSource.class)
public class MqMessageProducer {

    @Output(MqMessageSource.TEST_OUT_PUT)
    @Autowired
    private MessageChannel channel;


    public void sendMsg(String msg) {
        channel.send(MessageBuilder.withPayload(msg).build());
        System.err.println("消息发送成功："+msg);
    }
}
