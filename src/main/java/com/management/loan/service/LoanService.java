package com.management.loan.service;

import com.management.loan.dao.LoanDao;
import com.management.loan.entity.LoanDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanService {
    @Autowired
    private LoanDao loanDao;

    public void addLoanDetails(LoanDetail loanDetail){
        loanDao.addLoanDetails(loanDetail);
    }

    public List<LoanDetail> getApprovedLoan(){
        List<LoanDetail> newListOfLoanDetails = loanDao.getAllLoan().stream().filter(e->e.getApproval().equals("true")).collect(Collectors.toList());
        return newListOfLoanDetails;
    }


    public LoanDetail getById(int id){
        return loanDao.getByID(id);
    }

    public void updateLoanDetails(LoanDetail loanDetail){
        loanDao.updateLoan(loanDetail);
    }

    public void deleteEmployee(long Id){
        loanDao.deleteLoan(Id);
    }


    public List<LoanDetail> getLoanDetails(){
        System.out.println(loanDao.getAllLoan());
        return loanDao.getAllLoan();
    }


    public List<LoanDetail> getUnapprovedLoan(){
        List<LoanDetail> newListOfLoanDetails = loanDao.getAllLoan().stream().filter(e->e.getApproval().equals("false")).collect(Collectors.toList());
        return newListOfLoanDetails;
    }


}
