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
    String outputData = "{
  "customerName": "John",
  "customerId": "123",
  "transactions": [
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },  {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    },
    {
      "transactionId": "1",
      "transferredFrom": "AA",
      "transferredTo": "",
      "transactionDate": "20/01/2021",
      "transactionAmount": "100",
      "transactionType": "Credit"
    }
  ]
}";
    writer.write(outputData);
  }    
  
}
