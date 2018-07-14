package com.demo.service.impl;

import com.demo.dao.AccountDao;
import com.demo.service.AccountService;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl1 implements AccountService {

    //注入转账的DAO
    private AccountDao accountDao;

    //注入事务管理的模板
    private TransactionTemplate transactionTemplate;

    /**
     * @param out   :转出账号
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void transfer(final String out, final String in, final Double money) {

        transactionTemplate.execute(transactionStatus -> {
            accountDao.outMoney(out, money);
            //int i = 1/0;
            accountDao.inMoney(in, money);
            return null;
        });
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
