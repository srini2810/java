package com.cvs.cdc.reader;

import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
//import com.cvs.cdc.model.CdcResponseToDb;
//import com.cvs.cdc.repo.CdcRespRepo;
import com.cvs.cdc.repo.ImmunizationInfoRepo;
import org.springframework.batch.item.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Qualifier("immunizationinforeader")
public class ImmunizationInfoDBReader implements ItemReader<CdcRequestToApi> {

    @Autowired
    private ImmunizationInfoRepo immunizationInfoRepo;

    private List<CdcRequestToApi> listCedRequestToApi;

    private int index;

    @PostConstruct
    public void init() {
        listCedRequestToApi = immunizationInfoRepo.getAll();
        index = 0;
    }

    @Override
    public CdcRequestToApi read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        CdcRequestToApi entity = null;
        if (listCedRequestToApi != null && listCedRequestToApi.size() > index) {
            entity = listCedRequestToApi.get(index);
            index++;
        }
        return entity;
    }
}