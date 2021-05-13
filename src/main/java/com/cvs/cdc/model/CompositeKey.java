package com.cvs.cdc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

//@Embeddable
//@EmbeddedId
//@Embedded
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CompositeKey implements Serializable {
    //@Column(name="JOB_NM")
    private String jobNm;
    //@Column(name="EXTR_DT")
    private String extrDt;
   // @Column(name="RXC_IMM_ID")
    private String rxcImmId;
   // @Column(name="vax_event_id")
    //private String vaxEventId;
}