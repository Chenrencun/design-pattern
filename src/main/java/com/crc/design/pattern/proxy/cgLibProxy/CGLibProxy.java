package com.crc.design.pattern.proxy.cgLibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-01 13:54
 * @descripton:
 */
public class CGLibProxy implements MethodInterceptor {

    private Object object;

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = method.invoke(object, objects);
        after();
        return result;
    }

    public Object getProxy(Object object){
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }

    private void before(){
        System.out.println("执行方法前-----dosomething");
    }

    private void after(){
        System.out.println("执行方法后-----dosomething");
    }
}
