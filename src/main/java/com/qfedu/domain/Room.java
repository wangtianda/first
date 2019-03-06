package com.qfedu.domain;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
@Service("r2")
@ToString
public class Room {
    private Room(){
        System.out.println("无参");
    }

    public Room(Map hashMap) {
        System.out.println("有参");
        this.hashMap = hashMap;
    }



   @Autowired
    private Map hashMap;

    private void setHashMap(Map map){
        System.out.println("sett");
        this.hashMap = map;
    }


}
