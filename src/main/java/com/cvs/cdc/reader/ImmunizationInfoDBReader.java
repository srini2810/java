package com.cvs.cdc.reader;

import com.cvs.cdc.model.CdcRequestRowMapper;
import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
//import com.cvs.cdc.model.CdcResponseToDb;
//import com.cvs.cdc.repo.CdcRespRepo;
import com.cvs.cdc.repo.ImmunizationInfoRepo;
import com.sun.el.stream.Optional;
import org.springframework.batch.item.*;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.MySqlPagingQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Qualifier("immunizationinforeader")
public class ImmunizationInfoDBReader implements ItemReader<CdcRequestToApi> {

    @Autowired
    private ImmunizationInfoRepo immunizationInfoRepo;

    private List<CdcRequestToApi> listCedRequestToApi;

    private int index;

    /*@Autowired
    private DataSource dataSource;*/

    /*@PostConstruct
    public void init() {
        listCedRequestToApi = immunizationInfoRepo.findAll();
        index = 0;
    }*/

   // @Override
    public CdcRequestToApi read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        CdcRequestToApi entity = null;
        if (listCedRequestToApi != null && listCedRequestToApi.size() > index) {
            entity = listCedRequestToApi.get(index);
            index++;
        }
        if(listCedRequestToApi.size()==index){
            index=0;
        }
        List<CdcRequestToApi> listCedRequestToApi = immunizationInfoRepo.findAll();
       // return listCedRequestToApi.stream().findAny().get();

        return entity;
    }
   /* @Bean
    public JdbcPagingItemReader<CdcRequestToApi> pagingItemReader() {
        JdbcPagingItemReader<CdcRequestToApi> reader = new JdbcPagingItemReader<>();

        reader.setDataSource(this.dataSource);
        reader.setFetchSize(5);
       reader.setRowMapper(new CdcRequestRowMapper());



        TeradataPagingQueryProvider queryProvider = new TeradataPagingQueryProvider();
        queryProvider.setSelectClause("vaxEventId, rxcImmId, extrDt, jobNm, extType");
        queryProvider.setFromClause("from cdcRequestToApi");

        Map<String, Order> sortKeys = new HashMap<>(1);

        sortKeys.put("rxcImmId", Order.ASCENDING);
        sortKeys.put("extrDt",Order.ASCENDING);
        sortKeys.put("jobNm", Order.ASCENDING);

        queryProvider.setSortKeys(sortKeys);

        reader.setQueryProvider(queryProvider);

        return reader;
    }
*/

}