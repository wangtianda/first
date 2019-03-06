package com.qfedu.util;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public abstract class G implements BeanNameAware , InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
