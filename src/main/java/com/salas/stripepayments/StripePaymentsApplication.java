package com.salas.stripepayments;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StripePaymentsApplication {

    @Value("${stripe.api.secret}")
    private String value;

    @PostConstruct
    public void setup(){
        Stripe.apiKey = value;
    }

    public static void main(String[] args) {
        SpringApplication.run(StripePaymentsApplication.class, args);
    }

}
