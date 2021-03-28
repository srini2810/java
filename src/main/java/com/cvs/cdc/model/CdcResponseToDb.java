package com.cvs.cdc.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;

@EqualsAndHashCode
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="cdc_resp_info")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "cdcId")
//@EqualsAndHashCode(exclude = {"attributeOfTypeList", "attributeOfTypeSet"})
public class CdcResponseToDb /*implements Persistable<CdcResponseToDb>*/ {

    @Id
    @Column(name="cdc_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int cdcId;
    @Column(name="status")// Teradata procedure understands once the spring batch program runs and takes the chunks ( makes the chunk records status 0 to 1)
    private String status ;
    @Column(name="create_at")
    private String createAt ;
    @Column(name="updated_at")
    private String updatedAt;
    @Column(name="validation_errors")
    private String validationErrors ;
    @Column(name="processing_errors")
    private String processingErrors ;
    @Column(name="created_by")
    private String createdBy;
    @Column(name="updated_by")
    private String udpatedBy;
    @Column(name="status_message")
    private String cdcStatusMessage;
    /*@Column(name="vax_event_id")
    private String vaxEventId;*/
    @OneToOne(/*cascade = CascadeType.ALL*/fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "cdc_vax_event_id", referencedColumnName = "vax_event_id")
  /*  @JsonManagedReference
    @JsonBackReference*/
   // @JsonIgnore
   private CdcRequestToApi cdcRequestToApi;
/*
    @Override
    public CdcResponseToDb getId() {
        return CdcResponseToDb.builder().cdcId(cdcId)
                .cdcRequestToApi(cdcRequestToApi)
                .cdcStatusMessage(cdcStatusMessage)
                .createAt(createAt).build();
    }

    @Override
    public boolean isNew() {
        return false;
    }*/

    //It is addition of validation and processing errors

}
