package org.dongyf.fighting.controller;

import org.dongyf.fighting.model.Menu;
import org.dongyf.fighting.model.User;
import org.dongyf.fighting.service.FighterService;
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
    private FighterService fighterService;
    @Autowired
    private ImenuService woqu;

    public ImenuService getWoqu()
    {
        return woqu;
    }

    public void setWoqu(ImenuService woqu)
    {
        this.woqu = woqu;
    }


    @Resource
    public void setFighterService(FighterService fighterService)
    {
        this.fighterService = fighterService;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request)
    {

        List<Menu> menus = woqu.selectMenu();

        modelAndView.addObject("menus",menus);
        modelAndView.setViewName("index");
        String path = request.getServletContext().getRealPath("/");
        File file = new File(path + File.separator + "resources" + File.separator + "images");
        File[] files = file.listFiles();
        for (File f : files)
        {
            System.out.println(f.getName());
        }
        System.out.println();
        return modelAndView;
    }
    @RequestMapping(value = "/video/{org}",method = RequestMethod.GET)
    public ModelAndView getVideo(ModelAndView modelAndView,@PathVariable String org){
        List<User> users = fighterService.findAll();
        for (User user : users)
        {
            System.out.println(user);
        }

        List<Menu> menus = woqu.selectMenu();

        modelAndView.addObject("menus",menus);
        modelAndView.setViewName("index");
        modelAndView.addObject("users", users);
        return  modelAndView;
    }

    @RequestMapping(value = "/videos",method = RequestMethod.GET)
    public ModelAndView getVideos(ModelAndView modelAndView){
        modelAndView.setViewName("videos");
        return modelAndView;
    }
    @RequestMapping(value = "/schedule",method = RequestMethod.GET)
    public ModelAndView getSchedule(ModelAndView modelAndView){
        modelAndView.setViewName("schedule");
        return modelAndView;
    }
}
