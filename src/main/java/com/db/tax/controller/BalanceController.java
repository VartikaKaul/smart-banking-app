package com.db.tax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BalanceController {

    @GetMapping("/checkBalance")
    public String checkBalance() {
        return "50000.00 INR";
    }
}
