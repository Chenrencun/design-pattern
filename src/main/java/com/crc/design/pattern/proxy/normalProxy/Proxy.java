package com.crc.design.pattern.proxy.normalProxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 11:06
 * @descripton:
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request() {
        before();
        subject.request();
        after();
    }

    private void before(){
        System.out.println("执行方法前-----dosomething");
    }

    private void after(){
        System.out.println("执行方法后-----dosomething");
    }

}
