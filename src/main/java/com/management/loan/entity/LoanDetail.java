package com.management.loan.entity;

import javax.persistence.*;

@Entity
@Table(name = "loanDetails")
public class LoanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Address")
    private String address;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "LoanAmount")
    private float loanAmount;
    @Column(name = "Time")
    private int tenure;
    @Column(name = "isApproved")
    private String approval;



    public LoanDetail(int id,String name, String address, String phoneNumber, float loanAmount, int tenure, String approval) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.approval= approval;

    }

    public LoanDetail() {

    }

    @Override
    public String toString() {
        return "LoanDetail{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", loanAmount=" + loanAmount + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
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
