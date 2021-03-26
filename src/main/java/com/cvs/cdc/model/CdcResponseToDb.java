package com.cvs.cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CDC_RESP_INFO")
public class CdcResponseToDb {

    @Id
    @Column(name = "CDC_ID")
    private int cdcId;
    @Column(name = "STATUS") // Teradata procedure understands once the spring batch program runs and takes the chunks ( makes the chunk records status 0 to 1)
    private String status ;
    @Column(name = "create_at")
    private String createAt ;
    @Column(name = "udpate_at")
    private String updatedAt;
    @Column(name = "validation_errors")
    private String validationErrors ;
    @Column(name = "processing_errors")
    private String processingErrors ;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String udpatedBy;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cdc_vax_event_id",referencedColumnName = "vax_event_id")
    private CdcRequestToApi cdcRequestToApi;
    @Column(name = "status_message")
    private String cdcStatusMessage;
    //It is addition of validation and processing errors

}
