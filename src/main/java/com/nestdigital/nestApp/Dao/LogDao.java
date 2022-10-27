package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.LogModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface LogDao extends CrudRepository<LogModel,Integer> {

    @Modifying
    @Query(value = "UPDATE `log_tb` SET `check_out`=:check_out,`out_date`=:out_date WHERE `emp_id`=:emp_id",nativeQuery = true)
    void logOutStatus(String check_out,String out_date, Integer emp_id);

    @Query(value = "SELECT l.`id`, l.`check_in`, l.`check_out`, l.`emp_id`, l.`in_date`, l.`out_date`,e.e_name,e.e_desg FROM `log_tb` l JOIN employee_tb e ON l.emp_id=e.emp_id",nativeQuery = true)
    List<Map<String,String>> viewAllLogBy();

    @Query(value = "SELECT l.`id`, l.`check_in`, l.`check_out`, l.`emp_id`, l.`in_date`, l.`out_date`,e.e_name FROM `log_tb`l JOIN employee_tb e ON l.`emp_id`=e.emp_id WHERE l.`emp_id`=:emp_id",nativeQuery = true)
    List<Map<String,String>> viewlogByEmpid(Integer emp_id);
}
