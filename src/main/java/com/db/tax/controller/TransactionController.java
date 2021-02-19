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
    String outputData = "{\n" +
 " \"customerName\": \"John\",\n" +
 " \"customerId\": \"123\",\n" +
 " \"transactions\": [\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " }, {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " },\n" +
 " {\n" +
 " \"transactionId\": \"1\",\n" +
 " \"transferredFrom\": \"AA\",\n" +
 " \"transferredTo\": \"\",\n" +
 " \"transactionDate\": \"20/01/2021\",\n" +
 " \"transactionAmount\": \"100\",\n" +
 " \"transactionType\": \"Credit\"\n" +
 " }\n" +
 " ]\n" +
 "}";
    writer.write(outputData);
  }    
  
}
