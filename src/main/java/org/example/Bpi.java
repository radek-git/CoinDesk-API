package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Bpi {
    @lombok.Getter(onMethod_ = {@JsonProperty("USD")})
    @lombok.Setter(onMethod_ = {@JsonProperty("USD")})
    private Eur usd;
    @lombok.Getter(onMethod_ = {@JsonProperty("GBP")})
    @lombok.Setter(onMethod_ = {@JsonProperty("GBP")})
    private Eur gbp;
    @lombok.Getter(onMethod_ = {@JsonProperty("EUR")})
    @lombok.Setter(onMethod_ = {@JsonProperty("EUR")})
    private Eur eur;
}

