package com.spring.aopAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonAop {

    @Before(value = "execution(* com.spring.beans.Person.fun(..))")
    public void before(){
        System.out.println("前置方法..");
    }
}
