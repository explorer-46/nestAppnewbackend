package com.nestdigital.nestApp.Controller;

import com.nestdigital.nestApp.Dao.LeaveDao;
import com.nestdigital.nestApp.Model.LeaveModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class LeaveController {


    @Autowired
    private LeaveDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addleave",consumes = "application/json",produces = "application/json")
    public  String addLeave(@RequestBody LeaveModel lm){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentdate=String.valueOf((dt.format(now)));
        lm.setApplyDate(currentdate);

        dao.save(lm);
        return "{status:'success'}";
    }

    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/updatestatus",consumes = "application/json",produces = "application/json")
    public String updateStatus(@RequestBody LeaveModel lm){
        dao.updateById(lm.getStatus(),lm.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewallleaves")
    public List<Map<String ,String>> viewallleaves(){
       return (List<Map<String, String>>) dao.viewAllLeaveBy();

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewleavesbyempid",consumes = "application/json",produces = "application/json")
    public  List<Map<String,String>> viewLeavesById(@RequestBody LeaveModel lm){
        return (List<Map<String, String>>) dao.viewLeaveById(lm.getEmp_id());
    }

}
