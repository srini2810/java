package com.cvs.cdc.writer;

import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
//import com.cvs.cdc.model.CdcResponseToDb;
//import com.cvs.cdc.repo.CdcRespRepo;
import com.cvs.cdc.model.CdcResponseToDb;
import com.cvs.cdc.model.CompositeKey;
import com.cvs.cdc.repo.CdcRespRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Qualifier("cdcdbresponsewriter")
//@Transactional
public class CdcResponseDBWriter implements ItemWriter<CdcResponseToDb> {
    @Autowired
    private CdcRespRepo cdcRespRepo;

   /* @Override
    public void write(List<? extends CdcResponseFromApi> cdcResponseFromApis) throws Exception {
        List<CdcResponseToDb> cdcResponseToDbs = cdcResponseFromApis.stream().map(cdcResponseFromApi -> {

            String vaxEventId = cdcResponseFromApi.getCdcRequestToApi().getVaxEventId();

            return CdcResponseToDb.builder().cdcId(1).cdcStatusMessage(cdcResponseFromApi.getStorageResult().getREDACTED_DB().getStatus()).validationErrors("")
                                  .createAt("createdAt").createdBy("srini").status("1").processingErrors("").udpatedBy("srini").updatedAt("updatedAt").
            cdcRequestToApi(new CdcRequestToApi(vaxEventId)).build();
        }).collect(Collectors.toList());
       // CdcResponseToDb cdcResponseToDb = cdcResponseToDbs.get(0);
        cdcRespRepo.saveAll(cdcResponseToDbs);
        System.out.println("{} employees saved in database " + cdcResponseToDbs.size());
    }*/

    @Override
    //@Transactional
    public void write(List<? extends CdcResponseToDb> listCdcResponseToDb) throws Exception {

        //cdcRespRepo.saveAll(listCdcResponseToDb);
       /* CdcResponseToDb cdcResponseToDb = listCdcResponseToDb.stream().findFirst().get();
        //cdcResponseToDb.setCdcResponseKey(CompositeKey.builder().extrDt("2000-09-20").jobNm("3").rxcImmId("3").vaxEventId("test").build());
        cdcResponseToDb.setExtrDt("2000-09-20")*/
        /*CdcResponseToDb cdcResponseToDb = CdcResponseToDb.builder().valStatusMsg("test").updtTs("2023-01-09").statusCd("stat").rxcImmId("3").resultCd("tets").jobNm("3")
                                               .insrtTs("2020-01-04").extrDt("2020-03-04").activityTypCd("test").vaxEventId("test13").uploadStatusMsg("test").build();*/
        cdcRespRepo.save(listCdcResponseToDb.stream().findFirst().get());
    }
}
