package com.qfedu.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("book2")
public class Book implements Lifecycle {
    private static int i = 0;

     public Book(){
         System.out.println("无参构造");
        /* i++;
         System.out.println("穿建了"+i+"个对象");*/
    }
    @Value("2")
    private Integer id;

     public void init(){
         System.out.println("init方法执行");
     }

     public void _2(){
         System.out.println("destory方法执行");
     }

    public Student getBean(){
        System.out.println("动态工厂构建对象");
        return new Student();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        System.out.println("注入id");
        return id;
    }

  /*  public void setId(Integer id) {

        System.out.println("注入id");
        this.id = id;
    }*/

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
