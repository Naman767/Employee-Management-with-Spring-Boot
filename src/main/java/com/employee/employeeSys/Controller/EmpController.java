package com.employee.employeeSys.Controller;

import com.employee.employeeSys.Employee.Employee;
import com.employee.employeeSys.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    private ServiceClass service;

    @GetMapping("/employees")
    public List<Employee> getEmp(){
        return service.getEmp();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmp(@PathVariable Long id){
        service.deleteById(id);
    }

    @PostMapping("/employees")
    public Employee createEmp(@RequestBody Employee employee){
        return service.createEmp(employee);
    }

    @PostMapping("/employees/list")
    public List<Employee> createList(@RequestBody List<Employee> employees){
        return service.createList(employees);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmp(@PathVariable Long id,@RequestBody Employee employee){
        return service.updateEmpById(id, employee);
    }
}