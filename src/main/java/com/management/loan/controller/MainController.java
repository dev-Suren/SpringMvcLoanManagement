package com.management.loan.controller;

import com.management.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private LoanService loanService;

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
}
