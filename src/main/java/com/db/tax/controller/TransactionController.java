package com.db.tax.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController()
public class TransactionController implements HttpFunction {

      @Override
  public void service(HttpRequest request, HttpResponse response) throws Exception {
    BufferedWriter writer = response.getWriter();
    writer.write("Hello world!");
  }
    
    @GetMapping("/getTransactions")
    public String getTransactions() throws IOException {
        System.out.println("Hello Smart Banking");
        return new String(Files.readAllBytes(Paths.get(new ClassPathResource("data.json").getFile().getAbsolutePath())));
    }
}
