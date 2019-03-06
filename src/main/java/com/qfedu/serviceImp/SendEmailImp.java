package com.qfedu.serviceImp;

import com.qfedu.service.SendEmainService;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SendEmailImp implements SendEmainService {
    @Override
   // @Transactional( isolation = Isolation.REPEATABLE_READ , propagation=Propagation.REQUIRED,  rollbackFor={RuntimeException.class}  )
    public Integer send() {

            System.out.println("发送邮件了");
            int a = 3 / 0;


           // System.out.println("除异常了 " +);

        return 1;
    }

    @Override
    public void say() {
       this.send();
        System.out.println("abc");
    }
}
