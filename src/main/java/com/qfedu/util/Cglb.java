package com.qfedu.util;

import com.qfedu.service.LogService;
import com.qfedu.serviceImp.SendEmailImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Method;


public class Cglb implements MethodInterceptor {

    @Autowired
    private Enhancer enhancer = new Enhancer();

    public Object getInstatnce(){
        enhancer.setSuperclass(D.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }

  /*  @Autowired
    private LogService logService;*/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("kkkkk");
        Object o1 = methodProxy.invokeSuper(o, objects);

        return o1;
    }
}
