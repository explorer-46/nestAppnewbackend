package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security_tb")
public class SecurityModel {
    @Id
    @GeneratedValue

    public int id;
    public int sCode;
    public String sName;
    public String sPhn;
    public String sAddress;
    public String rDate;
    public String userName;
    public String pass;

    public SecurityModel() {
    }

    public SecurityModel(int id, int sCode, String sName, String sPhn, String sAddress, String rDate, String userName, String pass) {
        this.id = id;
        this.sCode = sCode;
        this.sName = sName;
        this.sPhn = sPhn;
        this.sAddress = sAddress;
        this.rDate = rDate;
        this.userName = userName;
        this.pass = pass;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getsCode() {
        return sCode;
    }

    public void setsCode(int sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPhn() {
        return sPhn;
    }

    public void setsPhn(String sPhn) {
        this.sPhn = sPhn;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}