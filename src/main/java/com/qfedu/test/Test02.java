package com.qfedu.test;

import com.qfedu.domain.Room;
import com.qfedu.util.Cglb;
import com.qfedu.util.D;
import com.qfedu.util.E;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.*;

public class Test02 {

    @Test
    public void fun01(){
       ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object r2 = applicationContext.getBean("r2");
        System.out.println(r2);




    }

    @Ignore
    public void  fun02(){
        Class[] interfaces = {E.class};

        Object o = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{E.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("你是谁");
                Parameter[] parameters = method.getParameters();
                Parameter parameter = parameters[0];
               // String name = (String) parameter.getRealName();
                System.out.println("参数  "+args[0]);


                return null;
            }
        });
        if (o instanceof E){
            System.out.println("true");
        }
        E o1 = (E)o;
        o1.tell("abc");
    }

@Ignore
    public void fun03(){
        Cglb cglb = new Cglb();
        D instatnce = (D) cglb.getInstatnce();
        instatnce.tell("sss");
    }
}
