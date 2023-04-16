package com.management.loan.entity;

import javax.persistence.*;

@Entity
@Table(name = "loanDetails")
public class LoanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private float loanAmount;

    public LoanDetail(String name, String address, String phoneNumber, float loanAmount) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loanAmount = loanAmount;
    }

    public LoanDetail() {

    }

    @Override
    public String toString() {
        return "LoanDetail{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", loanAmount=" + loanAmount + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }
}
