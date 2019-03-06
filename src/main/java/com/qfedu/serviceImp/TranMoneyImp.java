package com.qfedu.serviceImp;

import com.qfedu.dao.ChangeMoneyDao;
import com.qfedu.dao.ChangeScoreDao;
import com.qfedu.service.TransMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TranMoneyImp implements TransMoney {
    @Autowired
    @Qualifier(value = "changeMoneyDao")
    private ChangeMoneyDao changMoneyDao;

    @Autowired
    private ChangeScoreDao changeScoreDao;

    @Transactional(value = "manager" ,isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED
                              ,rollbackFor = {RuntimeException.class} )
    public void transform(String src, String target, Integer money) {

        System.out.println(changMoneyDao);
        System.out.println(changMoneyDao.getClass());

            changMoneyDao.increase(target, money);
           // int a = 3/0;
            changMoneyDao.decrease(src, money);

    }

    @Override
    public void transScore(String src, String target, Integer score) {
        try {
            changeScoreDao.increase(target, score);

            changeScoreDao.decrease(src, score);
            this.transform("李四", "王五", 1000);
        } catch (Exception e){
            System.out.println("出异常了");
        }
        }


}
