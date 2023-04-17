package com.management.loan.controller;

import com.management.loan.entity.LoanDetail;
import com.management.loan.entity.UserDetails;
import com.management.loan.service.UserService;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginAndRegistration {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("login") UserDetails details){
        UserDetails userDetails = userService.logins();

        if(details.getUsername().equals(userDetails.getUsername()) && details.getPassword().equals(userDetails.getPassword())){
            return "redirect:/home";
        }
        else {
            return "/";
        }

    }





    @PostMapping("/getdetails")
    public String posts(@ModelAttribute("getdetails") UserDetails details){
        userService.registration(details);
        return "index";
    }
}
