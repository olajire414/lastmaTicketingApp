package com.lastma.utils;

import com.lastma.data.models.Officer;
import com.lastma.dtos.requests.OfficerRequest;
import com.lastma.dtos.responses.OfficerResponse;


public class OfficerMapper {

    public static Officer mapToObject(OfficerRequest request){
        Officer officer = new Officer();
        officer.setId(request.getId());
        officer.setFullname(request.getFullname());
        officer.setActive(request.isActive());
        return officer;
    }

    public static OfficerResponse mapToResponse(Officer officer){
        OfficerResponse response = new OfficerResponse();
        response.setId(officer.getId());
        return response;
    }
    
    
}
