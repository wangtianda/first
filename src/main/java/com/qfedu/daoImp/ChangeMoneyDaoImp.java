package com.qfedu.daoImp;

import com.qfedu.dao.ChangeMoneyDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ChangeMoneyDaoImp implements ChangeMoneyDao {
   @Resource
   private JdbcTemplate template;


    public void increase(String target, Integer money) {
        String sql = "update money set money = money + ? where username = ?";
        template.update(sql,money,target);
    }


    public void decrease(String src, Integer money) {
        String sql = "update money set money = money - ? where username = ?";
        template.update(sql,money,src);
    }
}
