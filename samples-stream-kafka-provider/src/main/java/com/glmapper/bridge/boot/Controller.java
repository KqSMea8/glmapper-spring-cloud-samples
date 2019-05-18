package com.glmapper.bridge.boot;

import brave.Span;
import brave.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (gkmaper_2018@163.com) 2019/5/16 4:38 PM
 * @since:
 **/
@RestController
public class Controller {

    @Autowired
    Tracer tracer;

    @Autowired
    private MqMessageProducer mqMessageProducer;

    @GetMapping(value = "/testMq")
    public String testMq(@RequestParam("msg")String msg){
        Span span = tracer.newTrace();
        span.name("test");
        Span start = span.start();
        start.finish();
        mqMessageProducer.sendMsg(msg);
        return "发送成功";
    }
}
