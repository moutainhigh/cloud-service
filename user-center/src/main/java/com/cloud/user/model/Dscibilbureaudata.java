package com.cloud.user.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Dscibilbureaudata {

    @JsonProperty("Request")
    private Request request;
    public void setRequest(Request request) {
         this.request = request;
     }
     public Request getRequest() {
         return request;
     }

}