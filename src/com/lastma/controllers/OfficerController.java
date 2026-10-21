package com.lastma.controllers;

import com.lastma.dtos.requests.OfficerRequest;
import com.lastma.dtos.responses.ApiResponse;
import com.lastma.services.OfficerServiceImpl;
import com.lastma.services.OfficerServices;

public class OfficerController {

    private OfficerServices officerServices = new OfficerServiceImpl();

    public ApiResponse registerOfficer(OfficerRequest request){
        try{
            return new ApiResponse(true,officerServices.register(request));
        }catch (Exception e){
            return new ApiResponse(false,e.getMessage());
        }

    }
}
