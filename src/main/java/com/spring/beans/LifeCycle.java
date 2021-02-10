package com.spring.beans;

public class LifeCycle {
    private int unmeaning;

    public int getUnmeaning() {
        return unmeaning;
    }

    public void setUnmeaning(int unmeaning) {
        this.unmeaning = unmeaning;
        System.out.println("set...");
    }

    public LifeCycle() {
        System.out.println("空参构造函数..");
    }

    public void init(){
        System.out.println("init..");
    }

    public void destroy(){
        System.out.println("destroy..");
    }
}
