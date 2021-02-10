package com.spring.beans;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "xiaozhang")
public class Person implements InitializingBean, DisposableBean {

    @Autowired
    @Qualifier(value = "lc")
    private LifeCycle lifeCycle;

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

    @Override
    public String toString() {
        return "Person{" +
                "lifeCycle=" + lifeCycle +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("destory");
    }
}
