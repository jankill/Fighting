package org.dongyf.fighting.controller;


import org.dongyf.fighting.mapper.UserMapper;
import org.dongyf.fighting.service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


/**
 * Created by Dongyf on 2014/11/3.
 */
@Controller
public class FighterController

{
private FighterService fighterService;


    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView)
    {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
