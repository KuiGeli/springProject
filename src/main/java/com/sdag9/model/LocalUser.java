package com.sdag9.model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class LocalUser extends  DefaultModel{
    @Column
    private String email;

    @Column
    private String password;


    public String geteEmail() {
        return email;
    }

    public void seteEmail(String eMail) {
        this.email = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
