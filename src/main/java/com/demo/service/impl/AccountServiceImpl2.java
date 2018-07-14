package com.demo.service.impl;

import com.demo.dao.AccountDao;
import com.demo.service.AccountService;

public class AccountServiceImpl2 implements AccountService {

    //注入转账的DAO
    private AccountDao accountDao;

    /**
     * @param out   :转出账号
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        //int i = 1/0;
        accountDao.inMoney(in, money);

    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
