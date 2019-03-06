package com.qfedu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;


public interface ChangeMoneyDao {
    @Update({"update money set money = money + #{money} where username = #{target}"})
    public void increase(@Param("target") String target,@Param("money") Integer money);
    @Update("update money set money = money - #{money} where username = #{src}")
    public void decrease(@Param("src") String src, @Param("money") Integer money);
}
