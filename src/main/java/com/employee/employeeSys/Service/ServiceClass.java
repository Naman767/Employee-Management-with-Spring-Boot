package com.employee.employeeSys.Service;

import com.employee.employeeSys.Employee.Employee;
import com.employee.employeeSys.Repo.SampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClass {

    @Autowired
    private SampleRepo sampleRepo;

    public List<Employee> getEmp(){
        return sampleRepo.findAll();
    }

    public Optional<Employee> getById(Long id){
        return sampleRepo.findById(id);
    }

    public void deleteById(Long id){
        sampleRepo.deleteById(id);
    }

    public Employee createEmp(Employee employee){
        return sampleRepo.save(employee);
    }

    public List<Employee> createList(List<Employee> employee){
        return sampleRepo.saveAll(employee);
    }

    public Employee updateEmpById(Long id,Employee employee){
        return sampleRepo.save(employee);
    }

}
