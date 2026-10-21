package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;
import com.lastma.dtos.requests.DriverRequest;
import com.lastma.dtos.responses.DriverResponse;


public interface DriverService {

      DriverResponse register(DriverRequest driverRequest);




}
