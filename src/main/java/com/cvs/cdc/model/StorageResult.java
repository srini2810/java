package com.cvs.cdc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StorageResult{
    @JsonProperty("REDACTED_DB")
    public REDACTEDDB rEDACTED_DB;
    @JsonProperty("NON_REDACTED_DB") 
    public NONREDACTEDDB nON_REDACTED_DB;
}