package com.yale.bamboo.service.impl;

import com.yale.bamboo.service.IFooService;
import org.springframework.stereotype.Component;

@Component
public class FooServiceImpl implements IFooService{
    private int count = 0;
    @Override
    public void plusCount() {
        this.count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}
