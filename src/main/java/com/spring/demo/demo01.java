package com.spring.demo;

import com.spring.beans.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("demo01")
public class demo01 {
    @Autowired
    @Qualifier(value = "xiaoWang")
    private Person person;

    @Test
    public void testAop(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        ((Person)applicationContext.getBean("xiaoWang")).fun();
    }
}
