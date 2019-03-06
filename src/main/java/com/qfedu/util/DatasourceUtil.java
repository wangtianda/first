package com.qfedu.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;
@Repository
public class DatasourceUtil {

    public  DataSource getDataSource(){
        Properties properties = System.getProperties();
        try {
            properties.load(new FileInputStream("D:\\Users\\Edianzu\\IdeaProjects\\springtemp\\src\\main\\resources\\druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            return dataSource;


        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}
