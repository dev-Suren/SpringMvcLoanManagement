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
        UserDetails userDetails = userService.getDetails(details);
        if(details.getUsername()==userDetails.getUsername() && details.getPassword() == userDetails.getPassword()){
            if(userDetails.getIsAdmin()==true){
                return "redirect:/unapproved";
            }
            else {
                return "redirect:/loanform";
            }
        }
       return null;
    }
}
