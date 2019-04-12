package com.it.controller;

import com.it.model.User;
import com.it.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    @RequestMapping(value = "/modelAndView", method = RequestMethod.GET)
    public ModelAndView modelAndView() {
        return new ModelAndView("main", "message", "Hello World");
    }

    @RequestMapping(value = "/addPoint", method = RequestMethod.GET)
    public String addPoint(@ModelAttribute("name") String name, ModelMap model) {
        User point1 = getUserService().addUser();
        List<String> point = new ArrayList<>();
        point.add(point1.getId().toString());
        point.add(point1.getName());
        model.addAttribute("point",point);
        return "successPoint";
    }
}
