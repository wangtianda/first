package com.qfedu.dao;

public interface ChangeScoreDao {

    public void increase(String target,Integer score);
    public void decrease(String src,Integer score);
}
