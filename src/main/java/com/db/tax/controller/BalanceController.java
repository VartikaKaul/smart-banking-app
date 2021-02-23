package com.db.tax.controller;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.BufferedWriter;
import java.io.BufferedReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class BalanceController implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        Gson gson = new Gson();
        String name;
        JsonObject body = gson.fromJson(request.getReader(), JsonObject.class);
       // JSONObject qresult = body.getJSONObject("queryResult");
        System.out.println("Body: " + body.toString());
        System.out.println("Body req: " + body.toString());
     //   System.out.println("QueryResult" + qresult.toString());
        BufferedWriter writer = response.getWriter();
        String responseString = "Request Received";
        writer.write(responseString);
    }
}
