package com.demo.dao.impl;

import com.demo.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;
import java.util.Map;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    /**
     * @param out   :转出账号
     * @param money :转账金额
     */
    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money-? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money+? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }

    /**
     * 查询所有，对比数据
     */
    public List<Map<String, Object>> queryAll() {
        String sql = "select name,money from account";
        return this.getJdbcTemplate().queryForList(sql);
    }

}
