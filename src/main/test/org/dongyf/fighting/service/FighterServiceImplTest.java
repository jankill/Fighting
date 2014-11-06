package org.dongyf.fighting.service;

import org.dongyf.fighting.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;


public class FighterServiceImplTest
{

    @Test
    public void testFindUserById() throws Exception
    {
        File file = new File("webapp/resources/images/1.jpg");
        System.out.println(file.length());
    }
}