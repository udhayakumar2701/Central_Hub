package com.CentralHub.Central.Hub.VO;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

   private int statusCode;
   private HashMap<String,Object> data = new HashMap<>();
   private String error;

   public ApiResponse(){
       statusCode=200;
   }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public HashMap<String, Object> getData() {
        return data;
    }


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    @Override
    public String toString() {
        return "ApiResponse{" +
                "statusCode=" + statusCode +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
