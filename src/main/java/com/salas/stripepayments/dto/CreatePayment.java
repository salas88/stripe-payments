package com.salas.stripepayments.dto;

import com.google.gson.annotations.SerializedName;

public class CreatePayment {
    private Integer amount;
    private String requestThings;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRequestThings() {
        return requestThings;
    }

    public void setRequestThings(String requestThings) {
        this.requestThings = requestThings;
    }
}
