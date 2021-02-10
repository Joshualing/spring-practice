package com.spring.beans;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "xiaozhang")
public class Person implements InitializingBean, DisposableBean {

    private String name;

    private String sex;

    private int age;


    public String getName() {
        return name;
    }

    @Value("xiaowang")
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    @Value("female")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    @Value("16")
    public void setAge(int age) {
        this.age = age;
    }


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

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destory");
    }
}
