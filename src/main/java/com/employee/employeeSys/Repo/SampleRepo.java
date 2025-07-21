package com.employee.employeeSys.Repo;

import com.employee.employeeSys.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SampleRepo extends JpaRepository<Employee,Long> {

}
