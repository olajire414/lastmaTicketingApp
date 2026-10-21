package com.lastma.utils;


import com.lastma.data.models.Driver;
import com.lastma.dtos.requests.DriverRequest;
import com.lastma.dtos.responses.DriverResponse;

public class DriverMapper {

   public static Driver mapToObject(DriverRequest request){
       Driver driver = new Driver();
       driver.setId(request.getId());
       driver.setFullName(request.getFullname());
       driver.setPhoneNumber(request.getPhoneNumber());
       driver.setEmail(request.getEmail());
return driver;
   }

   public static DriverResponse mapToResponse(Driver driver){
       DriverResponse response = new DriverResponse();
       response.setId(driver.getId());
       return response;
   }

}