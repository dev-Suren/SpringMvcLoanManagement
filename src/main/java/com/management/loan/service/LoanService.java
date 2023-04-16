package com.management.loan.service;

import com.management.loan.dao.LoanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanDao loanDao;
}
