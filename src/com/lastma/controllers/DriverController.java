package com.lastma.controllers;

import com.lastma.dtos.requests.DriverRequest;
import com.lastma.dtos.requests.OfficerRequest;
import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.ApiResponse;
import com.lastma.services.*;

public class DriverController {
    private DriverService driverService = new DriverServiceImpl();

    public ApiResponse registerDriver(DriverRequest request) {
        try {
            return new ApiResponse(true, driverService.register(request));
        } catch (Exception e) {
            return new ApiResponse(false,e.getMessage());
        }

    }




}
