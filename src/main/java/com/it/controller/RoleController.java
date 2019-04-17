package com.it.controller;

import com.it.model.Role;
import com.it.services.RoleServise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoleController {

    RoleServise roleServise;
    public RoleServise getRoleServise() {
        return roleServise;
    }

    @RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
    public ModelAndView main() {

        return new ModelAndView("main", "", "");
    }

    @RequestMapping(value = "/addRole", method = RequestMethod.GET)
    public String addRole(@ModelAttribute("name") String name, ModelMap model) {
        roleServise.addRole(name);
        return "main";
    }
}
