package com.management.loan.entity;

import org.h2.engine.User;

import javax.persistence.*;

@Entity
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public UserDetails(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public UserDetails(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
