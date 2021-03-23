package com.cvs.cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CdcRequest {

    @Id
    private String vaxEventId;
    //Coded value
    private String extType;
    private  String pprlId;
    private String recipId;
    private String recipFirstName;
    private String recipMiddleName;
    private String recipLastName;
    private Date recipDob;
    private Character recipSex;
    private String recipAddressStreet;
    private String recipAddressStreet_2;
    private String recipAddressCity;
    //Coded value
    private String recipAddressCounty;
    //Coded value
    private String recipAddressState;
    private String recipAddressZip;
    //coded value
    private String recipRace1;
    //coded value
    private String recipRace2;
    //coded value
    private String recipRace3;
    //coded value
    private String recipRace4;
    //coded value
    private String recipRace5;
    //coded value
    private String recipRace6;
    //coded value
    private String recipEthnicity;
    private java.sql.Date   adminDate;
    //coded value
    private String cvx;
    //coded value
    private String ndc;
    //coded value
    private String mvx;
    private String lotNumber;
    private java.sql.Date vaxExpiration;
    private String vaxAdminSite;
    private String vaxRoute;
    private String doseNum;
    private String vaxSeriesComplete;
    private String responsibleOrg;
    private String adminName;
    private String vtrcksProvPin;
    private String adminType;
    private String adminAddressStreet;
    private String adminAddressStreet_2;
    private String adminAddressCity;
    private String adminAddressCounty;
    private String adminAddressState;
    private String adminAddressZip;
    private String vaxRefusal;
    private String cmorbidStatus;
    private String serology;
    private String Status;
    private java.sql.Date creationDate;
    private java.sql.Date updationDate;
    private String createdBy;
    private String updatedBy;





}
