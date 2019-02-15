package com.nf511.flower_team.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoTest {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao=ctx.getBean(UserDao.class);

    @Test
    public void selectAllUser() {
        System.out.println(userDao.selectAllUser());
    }

    @Test
    public void userLogin() {
        System.out.println(userDao.userLogin("刘琪","666666"));
    }
}