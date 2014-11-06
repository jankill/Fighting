package org.dongyf.fighting.controller;


import org.dongyf.fighting.mapper.UserMapper;
import org.dongyf.fighting.model.User;
import org.dongyf.fighting.service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Dongyf on 2014/11/3.
 */
@Controller
public class FighterController

{
    private FighterService fighterService;
    @Resource
    public void setFighterService(FighterService fighterService)
    {
        this.fighterService = fighterService;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView ,HttpServletRequest request)
    {
        List<User> users = fighterService.findAll();
        for (User user : users){
            System.out.println(user);
        }
modelAndView.addObject("users" ,users);

        modelAndView.setViewName("index");
       String path =  request.getServletContext().getRealPath("/");
        File file = new File(path+File.separator+"resources"+File.separator+"images");
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f.getName());
        }
        System.out.println();
        return modelAndView;
    }
}
