package com.qfedu.serviceImp;

import com.qfedu.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

@Repository
@Aspect
public class LogServiceImp implements LogService {
    @Override
   @Before(value = "execution( * com.qfedu.service.SendEmainService.*(..)))")
    public void _1() {
        System.out.println("执行1方法");

    }

    @Pointcut("execution( * com.qfedu.service.SendEmainService.*(..)))")
    public void hehe(){

    }

    @Override
    @Before(value = "LogServiceImp.hehe()")
    public String _2() throws Throwable {
        System.out.println("执行2方法");



        return "helloworld";
    }

    @Override
    public void _3( ProceedingJoinPoint point) {
        System.out.println("执行环绕前方法");
        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("执行环绕后方法");
    }

    @Override
    public void _4() {
        System.out.println("异常处理");
    }
}
