package com.exmaple.cj.springmvc.controller;

import com.exmaple.cj.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World dummy";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String showLoginPage() {
//        return "login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String handleUserLogin(ModelMap model, @RequestParam String name,
//                                  @RequestParam String password) {
//        if (!loginService.validateUser(name, password)) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//        model.put("name", name);
//        return "welcome";
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showWelcomePage(ModelMap model) {
//        model.put("name", "admin");
//        return "welcome";
//    }
}