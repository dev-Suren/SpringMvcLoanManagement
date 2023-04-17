package com.management.loan.service;

import com.management.loan.dao.LoanDao;
import com.management.loan.dao.UserDao;
import com.management.loan.entity.UserDetails;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void registration(UserDetails userDetails){
        userDao.addLoanDetails(userDetails);
    }

    public UserDetails logins(){
        return userDao.getElementByUsername();
    }
}
