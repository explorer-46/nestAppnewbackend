package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log_tb")
public class LogModel {
    @Id
    @GeneratedValue
    public int id;
    public int empId;
    public String checkIn;
    public String checkOut;
    public String inDate;
    public String outDate;

    public LogModel(int id, int empId, String checkIn, String checkOut, String inDate, String outDate) {
        this.id = id;
        this.empId = empId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.inDate = inDate;
        this.outDate = outDate;
    }

    public LogModel() {
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

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }
}
