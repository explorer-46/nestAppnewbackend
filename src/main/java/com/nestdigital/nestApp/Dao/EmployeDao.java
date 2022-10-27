package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.EmployeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeDao extends CrudRepository<EmployeModel,Integer> {

@Query(value = "SELECT `id`, `e_add`, `e_desg`, `e_dob`, `e_pass`, `e_name`, `e_phn`, `ejoind`, `email`, `emp_id` FROM `employee_tb` WHERE `emp_id`=:emp_id",nativeQuery = true)
    List<EmployeModel> viewByEmpid(Integer emp_id);

@Modifying
    @Query(value = "UPDATE `employee_tb` SET `e_add`=:e_add,`e_desg`=:e_desg,`e_dob`=:e_dob,`e_pass`=:e_pass,`e_name`=:e_name,`e_phn`=:e_phn,`ejoind`=:ejoind,`email`=:email,`emp_id`=:emp_id WHERE `emp_id`=:emp_id",nativeQuery = true)
    void upDateById(String e_add,String e_desg,String e_dob,String e_pass,String e_name, String e_phn,String ejoind,String email,Integer emp_id);
@Modifying
    @Query(value = "DELETE FROM `employee_tb` WHERE `emp_id`=:emp_id",nativeQuery = true)
    void deleteBy(Integer emp_id);
@Query(value = "SELECT `id`, `e_add`, `e_desg`, `e_dob`, `e_pass`, `e_name`, `e_phn`, `ejoind`, `email`, `emp_id` FROM `employee_tb` WHERE `email`=:email AND `e_pass`=:e_pass",nativeQuery = true)
    List<EmployeModel> sigInBY(String email,String e_pass);

}
