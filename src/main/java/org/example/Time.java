package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Time {
    @lombok.Getter(onMethod_ = {@JsonProperty("updated")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updated")})
    private String updated;
    @lombok.Getter(onMethod_ = {@JsonProperty("updatedISO")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updatedISO")})
    private String updatedIso;
    @lombok.Getter(onMethod_ = {@JsonProperty("updateduk")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updateduk")})
    private String updateduk;
}

