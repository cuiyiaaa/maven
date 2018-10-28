package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void test1() {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        System.out.println(context);
    }
}
