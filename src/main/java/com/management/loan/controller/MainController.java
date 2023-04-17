package com.management.loan.controller;

import com.management.loan.entity.LoanDetail;
import com.management.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private LoanService loanService;



    @RequestMapping("/loanform")
    public String loanForm(){
        return "loanform";
    }

    @PostMapping("/insertlona")
    public String insertLoan(@ModelAttribute("insertlona") LoanDetail details){
        System.out.println(details);
        details.setApproval("false");
        loanService.addLoanDetails(details);
        return "redirect:/loanform";
    }


    @GetMapping("/approved")
    public ModelAndView loadApprovalList(){
        ModelAndView modelAndView = new ModelAndView();
        if(loanService.getLoanDetails().isEmpty()){
            modelAndView.addObject("message", "No data found");
            modelAndView.setViewName("approvedtable");
        }else {
            modelAndView.addObject("loan_list",loanService.getApprovedLoan());
            modelAndView.setViewName("approvedtable");
        }

        return modelAndView;
    }

    @GetMapping("/unapproved")
    public ModelAndView loadUnApprovalList(){
        ModelAndView modelAndView = new ModelAndView();
        if(loanService.getLoanDetails().isEmpty()){
            modelAndView.addObject("message", "No data found");
            modelAndView.setViewName("unapprovedloan");
        }else {
            modelAndView.addObject("loan_list",loanService.getUnapprovedLoan());
            modelAndView.setViewName("unapprovedloan");
        }

        return modelAndView;
    }

    @GetMapping("editEmployee/{id}")
    public String updateLoanDetails(@PathVariable(value = "id") int id){
        LoanDetail loanDetail = loanService.getById(id);
        loanDetail.setApproval("true");
        loanService.updateLoanDetails(loanDetail);
        return "redirect:/unapproved";
    }
}
