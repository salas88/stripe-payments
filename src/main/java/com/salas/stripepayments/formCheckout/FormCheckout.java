package com.salas.stripepayments.formCheckout;

import javax.validation.constraints.*;

public class FormCheckout {

    @Min(4)
    private Integer amount;
    @Size(min = 4, max = 200)
    private String requestThings;
    @Email
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FormCheckout(@Min(4) Integer amount, @Max(200) String requestThings, @Email String email) {
        this.amount = amount;
        this.requestThings = requestThings;
        this.email = email;
    }

    public FormCheckout() {
    }
}
