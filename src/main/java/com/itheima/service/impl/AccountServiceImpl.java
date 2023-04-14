package com.itheima.service.impl;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(outAccount, money);
        accountMapper.incrMoney(inAccount, money);
        System.out.println("finish transfer");
    }
}