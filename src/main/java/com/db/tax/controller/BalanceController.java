package com.db.tax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;

@RestController()
public class BalanceController implements HttpFunction {

    @Override
  public void service(HttpRequest request, HttpResponse response) throws Exception {
    // BufferedWriter writer = response.getWriter();
    // writer.write("Your Current Balance is 50,000 INR");
      JsonWriter writer = response.getWriter();
        writer.writeObject(Json.createObjectBuilder()
                .add("balance", "50000").build());
  }
    
}
