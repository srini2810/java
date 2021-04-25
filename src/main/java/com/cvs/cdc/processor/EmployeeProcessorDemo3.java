package com.cvs.cdc.processor;

//import com.cvs.cdc.dto.EmployeeDTO;
//import com.cvs.cdc.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
/*

@Component
@Qualifier("employeeprocessordemo3")
public class EmployeeProcessorDemo3 implements ItemProcessor<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO process(Employee employee) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if(employee.getEmployeeId().equals("1"))
            objectMapper.writeValue(new File("employee.json"), employee);
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setAge(employee.getAge()+10);
        System.out.println("inside processor " + employee.toString());
        return employeeDTO;
    }
}*/
