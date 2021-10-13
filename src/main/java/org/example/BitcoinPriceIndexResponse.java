package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;


@lombok.Data
public class BitcoinPriceIndexResponse {
    @lombok.Getter(onMethod_ = {@JsonProperty("time")})
    @lombok.Setter(onMethod_ = {@JsonProperty("time")})
    private Time time;
    @lombok.Getter(onMethod_ = {@JsonProperty("disclaimer")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disclaimer")})
    private String disclaimer;
    @lombok.Getter(onMethod_ = {@JsonProperty("chartName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("chartName")})
    private String chartName;
    @lombok.Getter(onMethod_ = {@JsonProperty("bpi")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bpi")})
    private Bpi bpi;
}
