package com.yale.example;

import com.yale.bamboo.service.IFooService;
import com.yale.bamboo.service.impl.FooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@SpringBootTest(classes = FooServiceImpl.class)
public class FooServiceImplTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private IFooService foo;

    @Test
    public void testPlusCount() throws Exception{
        assertEquals(foo.getCount(), 0);
        foo.plusCount();
        assertEquals(foo.getCount(), 1);
    }
}
