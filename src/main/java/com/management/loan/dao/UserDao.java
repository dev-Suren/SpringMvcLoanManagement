package com.management.loan.dao;

import com.management.loan.entity.LoanDetail;
import com.management.loan.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    HibernateTemplate hibernateTemplate;
    @Transactional
    public void addLoanDetails(UserDetails userDetails){
        hibernateTemplate.save(userDetails);
    }


    public UserDetails getElementByUsername(){
        return  hibernateTemplate.get(UserDetails.class,1);
    }


}
