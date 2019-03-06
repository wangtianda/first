package com.qfedu.daoImp;

import com.qfedu.dao.ChangeScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ChangeScoreDaoImp implements ChangeScoreDao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void increase(String target, Integer score) {
        String sql = "update score set score = score + ? where username = ?";
        template.update(sql,score,target);
    }

    @Override
    public void decrease(String src, Integer score) {

        String sql = "update score set score = score - ? where username = ?";
        template.update(sql,score,src);

    }
}
