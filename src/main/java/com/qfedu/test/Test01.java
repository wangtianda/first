package com.qfedu.test;

import com.qfedu.dao.ADao;
import com.qfedu.dao.ADaoImp;
import com.qfedu.dao.B;
import com.qfedu.dao.ChangeMoneyDao;
import com.qfedu.daoImp.ChangeMoneyDaoImp;
import com.qfedu.domain.Student;
import com.qfedu.service.LogService;
import com.qfedu.service.SendEmainService;
import com.qfedu.service.TransMoney;
import com.qfedu.util.Cglb;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.*;

@ContextConfiguration({"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test01 {

    @Ignore
    public void test01(){
        Class<Student> clz = Student.class;
        Student student = null;
        Constructor<?>[] constructors = clz.getDeclaredConstructors();
        try {
            constructors[0].setAccessible(true);
            Object ss = constructors[0].newInstance("ss");
            System.out.println(ss);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
@Resource
private TransMoney transMoney;


    @Autowired
    private ADao adao;

    @Autowired
    private SendEmainService service;
  @Ignore
    public void fun02() {
   /*   ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
      System.out.println(applicationContext);
      Object changeMoneyDaoImp = applicationContext.getBean("changeMoneyDaoImp", ChangeMoneyDao.class);
      System.out.println(changeMoneyDaoImp.getClass());
      Object changeMoneyDao = applicationContext.getBean("changeMoneyDao");
      System.out.println(changeMoneyDao.getClass());*/
      //transMoney.transform("王五","李四",1000);
     //transMoney.transScore("周玲","小王",10);

      System.out.println(adao.getClass());
      System.out.println(adao);
      System.out.println(service.getClass());

  }

    @Ignore
    public void fun05(){
        B b = new B();
        ADaoImp object = (ADaoImp) b.getProxyObject(ADaoImp.class);
       // System.out.println(object);
        object.sayHello();
    }





    @Ignore
    public void fun06(){
/*
        SendEmainService o =(SendEmainService) Proxy.newProxyInstance(this.getClass().getClassLoader(), sendEmainService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                logService._1();

                Object invoke = method.invoke(sendEmainService, args);
                logService._2();
                return invoke;
                //logService._3("sss");
            }
        });*/

       // o.send("a","b");

     /*   System.out.println(cglb);
        SendEmailImp instatnce = (SendEmailImp)cglb.getInstatnce();
        instatnce.send("a","b");
*/



        //System.out.println(sendEmainService.getClass());

    }
}
