package com.db.tax.controller;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.BufferedWriter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class BalanceController implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        private static final Gson gson = new Gson();
        String name;
        JsonObject body = gson.fromJson(request.getReader(), JsonObject.class);
        JsonObject qresult = body.getAsJsonObject("queryResult");
        System.out.println("Body: " + body.toString());
        System.out.println("Body req: " + body.toString());
        System.out.println("QueryResult" + qresult.toString());
        BufferedWriter writer = response.getWriter();
        String responseString = "Request Received";
        writer.write(responseString);
    }
}
