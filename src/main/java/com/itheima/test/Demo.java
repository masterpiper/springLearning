package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transferMoney("Tom", "Lucy", 500);
    }
}
