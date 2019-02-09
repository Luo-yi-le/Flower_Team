package com.nf511.flower_team.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoTest {

    UserDao userDao;
    @Test
    public void selectAllUser() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao=ctx.getBean(UserDao.class);
        System.out.println(userDao.selectAllUser());
    }

    @Test
    public void userLogin() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao=ctx.getBean(UserDao.class);
        System.out.println(userDao.userLogin("刘琪","666666"));
    }
}