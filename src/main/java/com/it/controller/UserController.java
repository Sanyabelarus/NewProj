package com.it.controller;

import com.it.model.User;
import com.it.services.RoleServise;
import com.it.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    UserService userService;

    @Autowired
    MessageSource messageSource;

    public UserService getUserService() {
        return userService;
    }


    @RequestMapping(value = "/modelAndView", method = RequestMethod.GET)
    public ModelAndView modelAndView() {
        return new ModelAndView("main", "message", "Hello World");
    }

    @RequestMapping(value = "/addPoint", method = RequestMethod.GET)
    public String addUser(@ModelAttribute("name") String name, ModelMap model) {
        User point1 = getUserService().addUser(new User());
//        messageSource.getMessage("app.started", Object[],)
        return "successPoint";
    }
}
