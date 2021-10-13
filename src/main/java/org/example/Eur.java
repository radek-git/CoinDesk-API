package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Eur {
    @lombok.Getter(onMethod_ = {@JsonProperty("code")})
    @lombok.Setter(onMethod_ = {@JsonProperty("code")})
    private String code;
    @lombok.Getter(onMethod_ = {@JsonProperty("symbol")})
    @lombok.Setter(onMethod_ = {@JsonProperty("symbol")})
    private String symbol;
    @lombok.Getter(onMethod_ = {@JsonProperty("rate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("rate")})
    private String rate;
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("rate_float")})
    @lombok.Setter(onMethod_ = {@JsonProperty("rate_float")})
    private double rateFloat;
}
