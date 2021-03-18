package com.cvs.cdc.processor;

import com.cvs.cdc.dto.EmployeeDTO;
import com.cvs.cdc.model.CdcResponse;
import com.cvs.cdc.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Component
@Qualifier("employeeprocessorapi")
public class EmployeeProcessorApi implements ItemProcessor<Employee, CdcResponse> {

    @Autowired
    private RestTemplate apiRestTemplate;

    @Override
    public CdcResponse process(Employee employee) throws Exception {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setAge(employee.getAge()+10);
        final String url = "http://localhost:8080/cdcinfo";
        RequestEntity<EmployeeDTO> requestEntity = RequestEntity.post(url).body(employeeDTO);

        ResponseEntity<CdcResponse> cdcResponse = apiRestTemplate.postForEntity(url,requestEntity, CdcResponse.class);

       return cdcResponse.getBody();
    }
}