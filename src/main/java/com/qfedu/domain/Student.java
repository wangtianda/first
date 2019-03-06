package com.qfedu.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
@Component("student")

public class Student {


    //@PostConstruct
    public void _1(){
        System.out.println("构造器之后执行");
    }
    //@PreDestroy
    public void _2(){
        System.out.println("对象");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getInts() {
        return ints;
    }

    public void setInts(Integer[] ints) {
        this.ints = ints;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Map<String, Book> getMap() {
        return map;
    }

    public void setMap(Map<String, Book> map) {
        this.map = map;
    }


   public  Student(){

         }

    @Value("中国人")
    private String name;

   /*@Autowired
    @Qualifier("book2")*/
                                                      @Resource(name = "book2")
     private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    private Integer[] ints;
    private Set<Book> books;
    private Map<String,Book> map;




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ints=" + Arrays.toString(ints) +
                ", books=" + books +
                ", map=" + map +
                ",book=" + book +
                '}';
    }
}
