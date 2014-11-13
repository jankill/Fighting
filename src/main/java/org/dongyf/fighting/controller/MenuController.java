package org.dongyf.fighting.controller;

import org.dongyf.fighting.model.Menu;
import org.dongyf.fighting.entity.User;
import org.dongyf.fighting.service.UserService;
import org.dongyf.fighting.service.ImenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Controller
public class MenuController
{
    @Autowired
    private UserService userService;
    @Autowired
    private ImenuService woqu;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
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
    @RequestMapping(value = "/video/{org}",method = RequestMethod.GET)
    public ModelAndView getVideo(ModelAndView modelAndView,@PathVariable String org){

        modelAndView.setViewName("index");

        return  modelAndView;
    }

    @RequestMapping(value = "/videos/{catalog}",method = RequestMethod.GET)
    public ModelAndView getVideos(ModelAndView modelAndView,@PathVariable String catalog){

        modelAndView.setViewName("videos");
        System.out.println("这里是视频列表");
        return modelAndView;
    }
    @RequestMapping(value = "/schedule",method = RequestMethod.GET)
    public ModelAndView getSchedule(ModelAndView modelAndView){
        modelAndView.setViewName("schedule");
        return modelAndView;
    }
}
