package com.spring.beans;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "xiaoWang")
public class Person{

    @Value("xiaowang")
    private String name;

    @Value("male")
    private String sex;

    @Value("18")
    private int age;

    public  void fun(){
        System.out.println("fun...");
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
