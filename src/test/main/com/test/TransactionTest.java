package com.test;


import com.demo.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {


    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext1.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.transfer("aaa", "bbb", 200d);
    }

    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");
        AccountService accountService = (AccountService) ac.getBean("accountServiceProxy");
        accountService.transfer("aaa", "bbb", 200d);
    }

    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext3.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.transfer("aaa", "bbb", 200d);
    }

    @Test
    public void test4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext4.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.transfer("aaa", "bbb", 200d);
    }

}
