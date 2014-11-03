package org.dongyf.fighting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Dongyf on 2014/11/3.
 */
@Controller
public class FighterController

{
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView)
    {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
