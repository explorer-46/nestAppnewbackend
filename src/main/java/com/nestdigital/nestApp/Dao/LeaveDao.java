package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.LeaveModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface LeaveDao extends CrudRepository<LeaveModel,Integer> {


    @Modifying
    @Query(value = "UPDATE `leave_tb` SET `status`=:status WHERE `id`=:id",nativeQuery = true)
    void updateById(Integer status,Integer id);

    @Query(value = "SELECT l.`id`, l.`apply_date`, l.`discrip`, l.`emp_id`, l.`leave_date`, l.`status`, l.`type`,e.e_name,e.e_desg FROM `leave_tb` l JOIN  employee_tb e ON l.emp_id=e.emp_id",nativeQuery = true)
    List<Map<String,String>>viewAllLeaveBy();

    @Query(value = "SELECT l.`id`, l.`apply_date`, l.`discrip`, l.`emp_id`, l.`leave_date`, l.`status`, l.`type`,e.e_name,e.e_desg FROM `leave_tb` l JOIN employee_tb e ON l.emp_id=e.emp_id WHERE l.emp_id=:emp_id",nativeQuery = true)
    List<Map<String,String>>viewLeaveById(Integer emp_id);
}
