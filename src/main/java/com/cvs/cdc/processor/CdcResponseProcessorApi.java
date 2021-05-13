package com.cvs.cdc.processor;

import com.cvs.cdc.dto.EmployeeDTO;
import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
import com.cvs.cdc.model.CdcResponseToDb;
import com.cvs.cdc.model.CompositeKey;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Qualifier("cdcresponseeprocessor")
public class CdcResponseProcessorApi implements ItemProcessor<CdcRequestToApi, CdcResponseToDb> {

    @Autowired
    private RestTemplate apiRestTemplate;

    @Override
    public CdcResponseToDb process(CdcRequestToApi cdcRequestToApi) throws Exception {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId("1");
        employeeDTO.setFirstName("firstName");
        employeeDTO.setLastName("lastName");
        employeeDTO.setEmail("email");
        employeeDTO.setAge(40);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm.ss.SSS");

        LocalDateTime.now().format(dateTimeFormatter);
        //LocalDateTime localDateTime = LocalDateTime.parse(LocalDateTime.now().format(dateTimeFormatter));
        CdcResponseToDb cdcResponseToDb = CdcResponseToDb.builder()/*.cdcResponseKey(CompositeKey.builder()
                                                          .extrDt(LocalDate.now().toString()).jobNm("testJobnm").rxcImmId("12")
                                                          .vaxEventId("testvaxeventId").build())*/
                                                         .vaxEventId(cdcRequestToApi.getVaxEventId())
                                                         .jobNm(cdcRequestToApi.getJobNm())
                                                         .extrDt(cdcRequestToApi.getExtrDt()/*LocalDate.now().toString()*/)
                                                         .rxcImmId(cdcRequestToApi.getRxcImmId())
                                                         .activityTypCd("INIT")
                                                         .insrtTs(LocalDateTime.now().format(dateTimeFormatter))
                                                         .upldTs(LocalDateTime.now().format(dateTimeFormatter))
                                                         .rspnsTs(LocalDateTime.now().format(dateTimeFormatter))
                                                         .resultCd("resultCd")
                                                         .statusCd("statusCd").updtTs(LocalDateTime.now().format(dateTimeFormatter))
                                                         .uploadStatusMsg("uploadMsg")
                                                         .valStatusMsg("valStatusMsg").build();
       /* final String url = "http://localhost:8080/run/cdcinfo";
        RequestEntity<CdcRequestToApi> requestEntity = RequestEntity.post(url).body(cdcRequestToApi);

        ResponseEntity<CdcResponseFromApi> cdcResponse = apiRestTemplate.postForEntity(url,requestEntity, CdcResponseFromApi.class);
        CdcResponseFromApi cdcResponseFromApi = cdcResponse.getBody();
        cdcResponseFromApi.setCdcRequestToApi(cdcRequestToApi);*/
        return cdcResponseToDb;
    }
}