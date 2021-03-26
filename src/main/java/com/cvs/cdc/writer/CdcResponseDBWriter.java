package com.cvs.cdc.writer;

import com.cvs.cdc.model.CdcResponseFromApi;
import com.cvs.cdc.model.CdcResponseToDb;
import com.cvs.cdc.repo.CdcRespRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Qualifier("cdcdbresponsewriter")
public class CdcResponseDBWriter implements ItemWriter<CdcResponseFromApi> {

    @Autowired
    private CdcRespRepo cdcRespRepo;

    @Override
    public void write(List<? extends CdcResponseFromApi> cdcResponseFromApis) throws Exception {
        List<CdcResponseToDb> cdcResponseToDbs = cdcResponseFromApis.stream().map(cdcResponseFromApi -> {
            return CdcResponseToDb.builder().statusMessage(cdcResponseFromApi.getStorageResult().getREDACTED_DB().getStatus()).validationErrors("")
                                  .createAt("createdAt").createdBy("srini").status("1").processingErrors("").udpatedBy("srini").updatedAt("updatedAt").build();
        }).collect(Collectors.toList());
        cdcRespRepo.saveAll(cdcResponseToDbs);
        System.out.println("{} employees saved in database " + cdcResponseToDbs.size());
    }
}