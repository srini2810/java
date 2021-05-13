package com.cvs.cdc.model;

import org.springframework.batch.item.database.Order;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.Map;

public class CdcRequestToApiPage {

    private int pageNumber =0 ;

    private int pageSize =10;

    private Sort.Direction sortDirection = Sort.Direction.ASC;

    Map<String, Order> sortKeys = new HashMap<>(1);

    private String sortBy = "firstName";
}
