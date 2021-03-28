package com.cvs.cdc.processor;

import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Qualifier("employeeprocessorapi")
public class CdcResponseProcessorApi implements ItemProcessor<CdcRequestToApi, CdcResponseFromApi> {

    @Autowired
    private RestTemplate apiRestTemplate;

    @Override
    public CdcResponseFromApi process(CdcRequestToApi cdcRequestToApi) throws Exception {
       /* EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setAge(employee.getAge()+10);*/
        final String url = "http://localhost:8080/run/cdcinfo";
        RequestEntity<CdcRequestToApi> requestEntity = RequestEntity.post(url).body(cdcRequestToApi);

        ResponseEntity<CdcResponseFromApi> cdcResponse = apiRestTemplate.postForEntity(url,requestEntity, CdcResponseFromApi.class);
        CdcResponseFromApi cdcResponseFromApi = cdcResponse.getBody();
        cdcResponseFromApi.setCdcRequestToApi(cdcRequestToApi);
        return cdcResponseFromApi;
    }
}