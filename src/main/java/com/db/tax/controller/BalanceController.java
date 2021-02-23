package com.db.tax.controller;

import org.springframework.web.bind.annotation.RestController;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import org.json.JSONObject;
import org.json.JSONTokener;

@RestController()
public class BalanceController implements HttpFunction {

    @Override
  public void service(HttpRequest request, HttpResponse response) throws Exception {
         BufferedReader reader = request.getReader();
        JSONTokener tokener = new JSONTokener(reader);
        JSONObject json = new JSONObject(tokener);
        System.out.println(json.get("request.body.queryResult.paramters.givenName"));
        System.out.println(json.get("request.body.queryResult.paramters.unitCurrency.amount"));
        BufferedWriter writer = response.getWriter();
        String responseString = "Request Received";
        writer.write(responseString);
  }
    
}
