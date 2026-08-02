package com.sanskar.unitconverter.model;

public class TemperatureConversionRequest {

    private Double value = null;

    private String from;

    private String to;

    public TemperatureConversionRequest() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}