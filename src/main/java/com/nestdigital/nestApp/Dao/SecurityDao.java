package com.nestdigital.nestApp.Dao;

import com.nestdigital.nestApp.Model.SecurityModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface SecurityDao extends CrudRepository<SecurityModel,Integer> {

    @Query(value = "SELECT `id`, `r_date`, `pass`, `s_address`, `s_code`, `s_name`, `s_phn`, `user_name` FROM `security_tb` WHERE `s_code`=:s_code",nativeQuery = true)
    List<SecurityModel> searchSecurityBy(Integer s_code);
    @Modifying
    @Query(value = "DELETE FROM `security_tb` WHERE `s_code`=:s_code",nativeQuery = true)
    void deleteByScode(Integer s_code);

    @Modifying
    @Query(value = "UPDATE `security_tb` SET `pass`=:pass,`r_date`=:r_date,`s_address`=:s_address,`s_code`=:s_code,`s_name`=:s_name,`s_phn`=:s_phn,`user_name`=:user_name WHERE `s_code`=:s_code",nativeQuery = true)
    void updateBy(Integer s_code);

    @Query(value = "SELECT `id`,`pass`, `r_date`, `s_address`, `s_code`, `s_name`, `s_phn`, `user_name` FROM `security_tb` WHERE `user_name`=:user_name AND `pass`=:pass",nativeQuery = true)
    List<SecurityModel>signSBy(String user_name,String pass);
}
