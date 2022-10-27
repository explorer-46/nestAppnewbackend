package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_tb")
public class EmployeModel {

    @Id
    @GeneratedValue

    public int id;
    public int empId;
    public String e_Name;
    public String e_Phn;
    public String ejoinD;
    public String eAdd;
    public String eDob;
    public String eDesg;
    public String email;
    public String ePass;


    public EmployeModel(int id, int empId, String e_Name, String e_Phn, String ejoinD, String eAdd, String eDob, String eDesg, String email, String ePass) {
        this.id = id;
        this.empId = empId;
        this.e_Name = e_Name;
        this.e_Phn = e_Phn;
        this.ejoinD = ejoinD;
        this.eAdd = eAdd;
        this.eDob = eDob;
        this.eDesg = eDesg;
        this.email = email;
        this.ePass = ePass;
    }

    public EmployeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getE_Name() {
        return e_Name;
    }

    public void setE_Name(String e_Name) {
        this.e_Name = e_Name;
    }

    public String getE_Phn() {
        return e_Phn;
    }

    public void setE_Phn(String e_Phn) {
        this.e_Phn = e_Phn;
    }

    public String getEjoinD() {
        return ejoinD;
    }

    public void setEjoinD(String ejoinD) {
        this.ejoinD = ejoinD;
    }

    public String geteAdd() {
        return eAdd;
    }

    public void seteAdd(String eAdd) {
        this.eAdd = eAdd;
    }

    public String geteDob() {
        return eDob;
    }

    public void seteDob(String eDob) {
        this.eDob = eDob;
    }

    public String geteDesg() {
        return eDesg;
    }

    public void seteDesg(String eDesg) {
        this.eDesg = eDesg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getePass() {
        return ePass;
    }

    public void setePass(String ePass) {
        this.ePass = ePass;
    }
}

