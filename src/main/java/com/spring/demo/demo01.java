package com.spring.demo;

import com.spring.beans.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("demo01")
public class demo01 {
    private Person person;

    public Person getPerson() {
        return person;
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("lifeCycle"));
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("xiaozhang"));
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
