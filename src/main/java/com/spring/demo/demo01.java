package com.spring.demo;

import com.spring.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("demo01")
public class demo01 {
    private Person person;

    public Person getPerson() {
        return person;
    }


    public static void main(String[] args) {
        /**
         * 静态工厂
         */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("lifeCycle"));
        ((ClassPathXmlApplicationContext)applicationContext).close();
        /**
         * 注解注入
         */
        //demo01 d1 = (demo01)new ClassPathXmlApplicationContext("spring.xml").getBean("xiaowang");
        //System.out.println(d1.getPerson());
        /**
         * xml注入
         */
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        //Person xiaozhang = (Person)ctx.getBean("xiaozhang");
        //System.out.println(xiaozhang);
    }
}
