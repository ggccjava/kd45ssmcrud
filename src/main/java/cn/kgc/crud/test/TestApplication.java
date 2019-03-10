package cn.kgc.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2019/3/8.
 */
public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ct.toString());

    }
}
