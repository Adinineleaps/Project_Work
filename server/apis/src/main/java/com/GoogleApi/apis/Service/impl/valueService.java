package com.GoogleApi.apis.Service.impl;

import com.GoogleApi.apis.Dto.Values;
import com.GoogleApi.apis.Dto.Weightage_code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class valueService {
    @Autowired
    Weightage_code obj;
    public int sum(Values value)
    {
        int mul=obj.getVB();
        int sum=value.getAccountability()+value.getCollaboration()+value.getInclusion()+value.getMettle()+value.getPioneering()+value.getTrust();
        int val=(sum*100)/60;
        int sum1=(val*mul)/100;
        return sum1;
    }
}
