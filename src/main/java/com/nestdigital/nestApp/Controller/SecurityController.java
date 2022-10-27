package com.nestdigital.nestApp.Controller;

import com.nestdigital.nestApp.Dao.SecurityDao;
import com.nestdigital.nestApp.Model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity",consumes = "application/json",produces = "application/json")
    public String addSecurity(@RequestBody SecurityModel sm){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentdate=String.valueOf(dt.format(now));
        sm.setrDate(currentdate);
        dao.save(sm);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewallsec")
    public List<SecurityModel> viewAllSec(){
        return (List<SecurityModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchsecu",consumes = "application/json",produces = "application/json")
    public List<SecurityModel> searchSecurity(@RequestBody SecurityModel sm){
        return (List<SecurityModel>) dao.searchSecurityBy(sm.getsCode());

    }
    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletesec",consumes = "application/json",produces = "application/json")
    public String deleteSecurity(@RequestBody SecurityModel s){
        dao.deleteByScode(s.getsCode());
        return "{status:'success'}";
    }
    @Transactional
    @CrossOrigin(value = "*")
    @PostMapping(path = "/updatesecurity",consumes = "application/json",produces = "application/json")
    public String updateSecurity(@RequestBody SecurityModel s){
        dao.updateBy(s.getsCode());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/signinsecurity",consumes = "application/json",produces = "application/json")
    public List<SecurityModel> signInS(@RequestBody SecurityModel s){
        return (List<SecurityModel>) dao.signSBy(s.getUserName(),s.getPass());
    }

}
