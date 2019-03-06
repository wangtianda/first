package com.qfedu.dao;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class B implements MethodInterceptor {

    private Enhancer en = new Enhancer();
    public Object getProxyObject(Class clz){
        en.setSuperclass(clz);
        en.setCallback(this);
        return en.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始之前");
        System.out.println(this.getClass());
        Object invoke = methodProxy.invokeSuper(o,objects);
        System.out.println("结束");
        return invoke;

    }
}
