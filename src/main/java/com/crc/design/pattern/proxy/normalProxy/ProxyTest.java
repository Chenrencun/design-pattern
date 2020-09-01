package com.crc.design.pattern.proxy.normalProxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 11:10
 * @descripton: 代理模式测试类
 */
public class ProxyTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
