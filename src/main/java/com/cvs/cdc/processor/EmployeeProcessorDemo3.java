package com.cvs.cdc.processor;

import com.cvs.cdc.dto.EmployeeDTO;
import com.cvs.cdc.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employeeprocessordemo3")
public class EmployeeProcessorDemo3 implements ItemProcessor<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO process(Employee employee) throws Exception {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setAge(employee.getAge()+10);
        System.out.println("inside processor " + employee.toString());
        return employeeDTO;
    }
}