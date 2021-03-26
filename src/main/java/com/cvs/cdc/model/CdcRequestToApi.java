package com.cvs.cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "immunization_info")
public class CdcRequestToApi {

    @Id
    @Column(name="vax_event_id")
    private String vaxEventId;
    //Coded value
    @Column(name="ext_type")
    private String extType;
    @Column(name="pprl_id")
    private  String pprlId;
    @Column(name="recip_id")
    private String recipId;
    @Column(name="recip_first_name")
    private String recipFirstName;
    @Column(name="recip_middle_name")
    private String recipMiddleName;
    @Column(name="recip_last_name")
    private String recipLastName;
    @Column(name="recip_dob")
    private String recipDob;
    @Column(name="recip_sex")
    private Character recipSex;
    @Column(name="recip_address_street")
    private String recipAddressStreet;
    @Column(name="recip_address_street_2")
    private String recipAddressStreet_2;
    @Column(name="recip_address_city")
    private String recipAddressCity;
    //Coded value
    @Column(name="recip_address_county")
    private String recipAddressCounty;
    //Coded value
    @Column(name="recip_address_state")
    private String recipAddressState;
    @Column(name="recip_address_zip")
    private String recipAddressZip;
    @OneToOne(mappedBy = "immunization_info")
    private CdcResponseToDb cdcResponseToDb;
    @Column(name="recip_race_1")
    private String recipRace1;
    //coded value
    @Column(name="recip_race_2")
    private String recipRace2;
    //coded value
    @Column(name="recip_race_3")
    private String recipRace3;
    //coded value
    @Column(name="recip_race_4")
    private String recipRace4;
    //coded value
    @Column(name="recip_race_5")
    private String recipRace5;
    //coded value
    @Column(name="recip_race_6")
    private String recipRace6;
    //coded value
    @Column(name="recip_ethnicity")
    private String recipEthnicity;
    @Column(name="admin_date")
    private String   adminDate;
    //coded value
    @Column(name="cvx")
    private String cvx;
    //coded value
    @Column(name="ndc")
    private String ndc;
    //coded value
    @Column(name="ndc")
    private String mvx;
    @Column(name="ndc")
    private String lotNumber;
    @Column(name="ndc")
    private String vaxExpiration;
    @Column(name="ndc")
    private String vaxAdminSite;
    @Column(name="ndc")
    private String vaxRoute;
    @Column(name="ndc")
    private String doseNum;
    @Column(name="ndc")
    private String vaxSeriesComplete;
    @Column(name="ndc")
    private String responsibleOrg;
    @Column(name="ndc")
    private String adminName;
    @Column(name="ndc")
    private String vtrcksProvPin;
    @Column(name="ndc")
    private String adminType;
    @Column(name="ndc")
    private String adminAddressStreet;
    @Column(name="ndc")
    private String adminAddressStreet_2;
    @Column(name="ndc")
    private String adminAddressCity;
    @Column(name="ndc")
    private String adminAddressCounty;
    @Column(name="ndc")
    private String adminAddressState;
    @Column(name="ndc")
    private String adminAddressZip;
    @Column(name="ndc")
    private String vaxRefusal;
    @Column(name="ndc")
    private String cmorbidStatus;
    @Column(name="ndc")
    private String serology;
}
