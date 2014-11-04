package org.dongyf.fighting.service;

import org.dongyf.fighting.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class FighterServiceImplTest
{

    @Test
    public void testFindUserById() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
       FighterService fighterService = context.getBean("fighterService",FighterService.class);
        List<User> users = fighterService.findAll();
        for (User user : users){
            System.out.println(user);
        }

    }
}