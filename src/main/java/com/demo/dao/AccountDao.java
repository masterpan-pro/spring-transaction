package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface AccountDao {

    /**
     * @param out   :转出账号
     * @param money :转账金额
     */
    void outMoney(String out, Double money);

    /**
     * @param in    :转入账号
     * @param money :转账金额
     */
    void inMoney(String in, Double money);

    /**
     * 查询所有，对比数据
     */
    List<Map<String, Object>> queryAll();

}
