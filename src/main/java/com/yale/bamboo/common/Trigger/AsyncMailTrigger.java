package com.yale.bamboo.common.Trigger;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class AsyncMailTrigger {
    @Async
    public void senMail(Map<String,String> properties) {
        System.out.println("Trigger mail in a New Thread B:: "  + Thread.currentThread().getName());
        properties.forEach((K,V)->System.out.println("Key::" + K + " Value ::" + V));
    }
}
