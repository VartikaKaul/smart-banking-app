package com.db.tax.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController()
public class TransactionController {

    @GetMapping("/getTransactions")
    public String getTransactions() throws IOException {
        return new String(Files.readAllBytes(Paths.get(new ClassPathResource("data.json").getFile().getAbsolutePath())));
    }
}
