package org.dongyf.fighting.controller;


import org.dongyf.fighting.model.User;
import org.dongyf.fighting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


/**
 * Created by Dongyf on 2014/11/3.
 */
@Controller
public class UserController

{
    @Autowired
    private UserService userService;


    @RequestMapping(value = {"/user"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request)
    {
        User u = new User();
        u.setUserLogin("dongyf");
        u.setUserPass("123456");
        User user = userService.login(u);
        modelAndView.setViewName("index");
        String path = request.getServletContext().getRealPath("/");
        File file = new File(path + File.separator + "resources" + File.separator + "images");
        File[] files = file.listFiles();
        for (File f : files)
        {
            System.out.println(f.getName());
        }
        System.out.println(user);
        return modelAndView;
    }

}