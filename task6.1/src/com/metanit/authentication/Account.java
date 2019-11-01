package com.metanit.authentication;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;
    private String password;
    private String roles;
    private String mail;

    public Account(String name, String password, String roles, String mail) {
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

    public String getMail() {
        return mail;
    }
}
