package com.cvs.cdc.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Table(name="immunization_info")
//@EqualsAndHashCode(exclude = {"attributeOfTypeList", "attributeOfTypeSet"})
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "vaxEventId")
public class CdcRequestToApi {

    @Id
    @Column(name="vax_event_id")
    private String vaxEventId;
    //Coded value
    @Column(name="ext_type ")
    private String extType;
    @Column(name="pprl_id ")
    private  String pprlId;
    @Column(name="recip_id")
    private String recipId;

    public CdcRequestToApi(String vaxEventId) {
        this.vaxEventId = vaxEventId;
    }

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
    @Column(name="recip_address_street_2 ")
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
    @OneToOne(mappedBy = "cdcRequestToApi",cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    //@PrimaryKeyJoinColumn
    //@MapsId
   // @JsonManagedReference
    //@JsonIgnore
   /* @JsonManagedReference
    @JsonBackReference
    @JsonIgnore*/
   //@JsonIgnore
   // @JsonIgnoreProperties("cdcRequestToApi")
   /* @JsonIgnore
    @ToString.Exclude*/
    private CdcResponseToDb cdcResponseToDb;
   /* @Column
    private String recipRace1;
    //coded value
    @Column
    private String recipRace2;
    //coded value
    @Column
    private String recipRace3;
    //coded value
    @Column
    private String recipRace4;
    //coded value
    @Column
    private String recipRace5;
    //coded value
    @Column
    private String recipRace6;
    //coded value
    @Column
    private String recipEthnicity;
    @Column
    private String   adminDate;
    //coded value
    @Column
    private String cvx;
    //coded value
    @Column
    private String ndc;
    //coded value
    @Column
    private String mvx;
    @Column
    private String lotNumber;
    @Column
    private String vaxExpiration;
    @Column
    private String vaxAdminSite;
    @Column
    private String vaxRoute;
    @Column
    private String doseNum;
    @Column
    private String vaxSeriesComplete;
    @Column
    private String responsibleOrg;
    @Column
    private String adminName;
    @Column
    private String vtrcksProvPin;
    @Column
    private String adminType;
    @Column
    private String adminAddressStreet;
    @Column
    private String adminAddressStreet_2;
    @Column
    private String adminAddressCity;
    @Column
    private String adminAddressCounty;
    @Column
    private String adminAddressState;
    @Column
    private String adminAddressZip;
    @Column
    private String vaxRefusal;
    @Column
    private String cmorbidStatus;
    @Column
    private String serology;*/
}
