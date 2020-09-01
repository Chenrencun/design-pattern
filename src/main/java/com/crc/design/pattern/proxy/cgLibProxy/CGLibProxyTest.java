package com.crc.design.pattern.proxy.cgLibProxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 14:05
 * @descripton: cgLib代理测试类
 */
public class CGLibProxyTest {

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        Subject subjectProxy = (Subject)cgLibProxy.getProxy(new ConcreteSubject());
        subjectProxy.request();
    }
}
