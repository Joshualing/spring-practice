package com.spring.factory;

import com.spring.beans.Person;

public class StaticFactory {
    public static Person getPerson(String name, String sex, int age) {
        Person person=new Person(name, sex, age);
        return person;
    }
}
