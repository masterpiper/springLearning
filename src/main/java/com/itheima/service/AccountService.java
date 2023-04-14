package com.itheima.service;

public interface AccountService {
    // transfer money
    void transferMoney(String outAccount, String inAccount, Integer money);
}
