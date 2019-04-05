package com.it.controller;


import com.it.model.Roles;
import com.it.model.User;
import com.it.repository.RolesRepository;
import com.it.services.UserService;
import com.it.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired UserServiceImpl userService;
    @Autowired RolesRepository rolesRepository;

    @RequestMapping(value = "/modelAndView", method = RequestMethod.GET)
    public ModelAndView modelAndView() {
        return new ModelAndView("main", "message", "Hello World");
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.GET)
    public String modelAttribute(@ModelAttribute("Name") String name, @ModelAttribute ("Login") String login,
                                 @ModelAttribute("Password") String password,
                                 @ModelAttribute("Email") String email,
                                 @ModelAttribute("Roles") Roles roles, ModelMap model) {
        Roles roles1 = new Roles();
        rolesRepository.save(roles1);
        Optional <Roles> roles3 = rolesRepository.findById(1);
        User user = new User(roles3.get(),name,login,password,email);
        userService.addUser(user);
        return "User created";
    }
}
