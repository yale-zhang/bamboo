package com.yale.bamboo.common.Caller;

import com.yale.bamboo.common.Trigger.AsyncMailTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AsyncCaller {
    @Autowired
    AsyncMailTrigger asyncMailTriggerObject;

    public void rightWayToCall() {
        System.out.println("Calling From rightWayToCall Thread " + Thread.currentThread().getName());
        asyncMailTriggerObject.senMail(populateMap());
    }

    public void wrongWayToCall() {
        System.out.println("Calling From wrongWayToCall Thread " + Thread.currentThread().getName());
        this.senMail(populateMap());
    }

    private Map<String,String> populateMap(){
        Map<String,String> mailMap= new HashMap<String,String>();
        mailMap.put("body", "A Ask2Shamik Article");
        return mailMap;
    }

    @Async
    public void senMail(Map<String,String> properties) {
        System.out.println("Trigger mail in a New Thread A:: "  + Thread.currentThread().getName());
        properties.forEach((K,V)->System.out.println("Key::" + K + " Value ::" + V));
    }
}
