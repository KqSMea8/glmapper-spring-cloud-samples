package com.glmapper.bridge.boot;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 *
 * 这个通道的名字就是配置中 binding 的名字
 *
 * @author: guolei.sgl (gkmaper_2018@163.com) 2019/5/16 4:31 PM
 * @since:
 **/
public interface MqMessageSource {
    String TEST_OUT_PUT = "testOutPut";

    @Output(TEST_OUT_PUT)
    MessageChannel testOutPut();
}
