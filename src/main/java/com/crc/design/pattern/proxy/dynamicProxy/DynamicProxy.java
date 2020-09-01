package com.crc.design.pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 11:20
 * @descripton:
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(object, args);
        after();
        return result;
    }

    public Object getProxy(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    private void before(){
        System.out.println("执行方法前-----dosomething");
    }

    private void after(){
        System.out.println("执行方法后-----dosomething");
    }
}
