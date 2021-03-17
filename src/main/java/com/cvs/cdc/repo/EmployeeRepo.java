package com.cvs.cdc.repo;

import com.cvs.cdc.model.Employee;
import com.cvs.cdc.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
}