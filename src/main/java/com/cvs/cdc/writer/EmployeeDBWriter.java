package com.cvs.cdc.writer;

import com.cvs.cdc.model.Employee;
import com.cvs.cdc.model.Employees;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.cvs.cdc.repo.EmployeeRepo;

import java.util.List;

@Component
@Qualifier("employeewriter")
public class EmployeeDBWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void write(List<? extends Employee> employees) throws Exception {
        employeeRepo.saveAll(employees);
        System.out.println("{} employees saved in database " + employees.size());
    }
}