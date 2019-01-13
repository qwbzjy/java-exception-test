package com.proxy;

/**
 * @author created by qwb on 2019/1/11 8:54
 */
public class RealSubject implements Subject{

    private String name;
    private String pwd;
    public RealSubject(){}
    public RealSubject(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }
    @Override
    public void doSomething() {
        System.out.println("RealSubject do something"+name+pwd);
    }

    @Override
    public void doingSomething() {
        System.out.println("RealSubject doing something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
