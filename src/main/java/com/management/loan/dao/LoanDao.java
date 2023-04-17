package com.management.loan.dao;

import com.management.loan.entity.LoanDetail;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public class LoanDao{
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public void addLoanDetails(LoanDetail loanDetail){
        hibernateTemplate.save(loanDetail);
    }

    public List<LoanDetail> getAllLoan(){
        return hibernateTemplate.loadAll(LoanDetail.class);
    }

    public LoanDetail getByID(int id){
        return  hibernateTemplate.get(LoanDetail.class,id);
    }

    @Transactional
    public void updateLoan(LoanDetail loanDetail){
        hibernateTemplate.update(loanDetail);
    }

    public void deleteLoan(long Id){
        hibernateTemplate.delete(hibernateTemplate.load(LoanDetail.class,Id));
    }
}
