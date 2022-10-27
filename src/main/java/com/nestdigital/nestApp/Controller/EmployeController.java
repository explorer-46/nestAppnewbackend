package com.nestdigital.nestApp.Controller;

import com.nestdigital.nestApp.Dao.EmployeDao;
import com.nestdigital.nestApp.Model.EmployeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    private EmployeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",consumes = "application/json",produces = "application/json")
    public String addEmp(@RequestBody EmployeModel em){
        dao.save(em);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewallemp")
    public List<EmployeModel> viewAll(){
        return (List<EmployeModel>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchemp",consumes = "application/json",produces = "application/json")
    public List<EmployeModel> searchEmp(@RequestBody EmployeModel m){
        return(List<EmployeModel>) dao.viewByEmpid(m.getEmpId());
    }
    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path= "/updateemp",consumes = "application/json",produces = "application/json")
    public  String updateEmp(@RequestBody EmployeModel e){
        dao.upDateById(e.geteAdd(),e.geteDesg(),e.geteDob(),e.getePass(),e.getE_Name(),e.getEjoinD(),e.getE_Phn(),e.getEmail(),e.getEmpId(),e.getId());
        return "{status:'success'}";
    }
    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteemp",consumes = "application/json",produces = "application/json")
    public String deleteEmp(@RequestBody EmployeModel e){
        dao.deleteBy(e.getEmpId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/signin",consumes = "application/json",produces = "application/json")
    public  List<EmployeModel> signIn(@RequestBody EmployeModel e){
        return (List<EmployeModel>) dao.sigInBY(e.getEmail(),e.getePass());
    }


}
