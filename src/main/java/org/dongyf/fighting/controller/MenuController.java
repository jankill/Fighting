package org.dongyf.fighting.controller;

import org.dongyf.fighting.model.Menu;
import org.dongyf.fighting.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Dongyf on 2014/11/8.
 */
@Controller
public class MenuController
{
    @Autowired
    private MenuService menuService;


    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request)
    {
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping(value = "/video/{org}",method = RequestMethod.GET)
    public ModelAndView getVideo(ModelAndView modelAndView,@PathVariable String org){

        modelAndView.setViewName("video");

        return  modelAndView;
    }

    @RequestMapping(value = "/videos/{catalog}",method = RequestMethod.GET)
    public ModelAndView getVideos(ModelAndView modelAndView,@PathVariable String catalog){
        System.out.println(catalog);
        List<Menu> menus = menuService.selectOrgs(catalog);
        for (Menu m : menus)
        {
            System.out.println(m);
        }
        modelAndView.addObject("Orgs", menus);
        modelAndView.setViewName("videos");
        System.out.println("这里是视频列表");

        return modelAndView;
    }
    @RequestMapping(value = "/schedule",method = RequestMethod.GET)
    public ModelAndView getSchedule(ModelAndView modelAndView){
        modelAndView.setViewName("schedule");
        return modelAndView;
    }

    @RequestMapping(value = "admin/edit", method = RequestMethod.GET)
    public ModelAndView editPost(ModelAndView modelAndView)
    {
        modelAndView.setViewName("admin/edit");
        return modelAndView;
    }

    @RequestMapping(value = "admin/save", method = RequestMethod.POST)
    public ModelAndView savePost(ModelAndView modelAndView)
    {
        modelAndView.setViewName("admin/edit");
        return modelAndView;
    }


}
