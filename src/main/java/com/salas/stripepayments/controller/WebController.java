package com.salas.stripepayments.controller;

import com.salas.stripepayments.formCheckout.FormCheckout;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.logging.Logger;

@Controller
public class WebController {

    @Value("${stripe.public.key}")
    private String stripePublicKey;
    private Logger logger = Logger.getLogger(WebController.class.getName());

    @GetMapping("/")
    public String home(Model theModel){
        FormCheckout formCheckout = new FormCheckout();
        theModel.addAttribute("formCheckout", formCheckout);
        return "index";
    }

    @PostMapping("/")
    public String homeCheckout(@Valid @ModelAttribute("formCheckout") FormCheckout formCheckout, BindingResult bindingResult, Model theModel){
        if(bindingResult.hasErrors()){
            return "index";
        }
        theModel.addAttribute("stripePublicKey", stripePublicKey);
        theModel.addAttribute("amount", formCheckout.getAmount());
        theModel.addAttribute("email", formCheckout.getEmail());
        logger.info(formCheckout.getAmount().toString());
        return "checkout";
    }
}
