package com.crc.design.pattern.proxy.dynamicProxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 11:22
 * @descripton: 动态代理测试类
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();

        Subject subjectProxy = (Subject)proxy.getProxy(new ConcreteSubject());
        subjectProxy.request();

    }
}
