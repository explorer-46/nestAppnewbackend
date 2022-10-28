package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leave_tb")
public class LeaveModel {
    @Id
    @GeneratedValue
    public int id;
    public int emp_id;
    public String type;
    public String discrip;
    public String applyDate;
    public String leaveDate;
    public int status;

    public LeaveModel(int id, int emp_id, String type, String discrip, String applyDate, String leaveDate, int status) {
        this.id = id;
        this.emp_id = emp_id;
        this.type = type;
        this.discrip = discrip;
        this.applyDate = applyDate;
        this.leaveDate = leaveDate;
        this.status = status;
    }

    public LeaveModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
