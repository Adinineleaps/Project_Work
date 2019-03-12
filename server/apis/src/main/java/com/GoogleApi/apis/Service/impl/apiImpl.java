package com.GoogleApi.apis.Service.impl;

import com.GoogleApi.apis.Dto.Values;
import com.GoogleApi.apis.Dto.Weightage_code;
import com.GoogleApi.apis.Service.apiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class apiImpl implements apiService {
    @Autowired
    Weightage_code obj;



    public int set_code(String b)
    {

        //obj.setCode(b);
        String a=obj.getCode();
        if(b.equals("A"))
        {
            obj.setPP(80);
            obj.setVB(20);
            obj.setOth(0);
        }
        else if (b.equals("B"))
        {
            obj.setPP(60);
            obj.setVB(20);
            obj.setOth(20);
        }
        else if (b.equals("C"))
        {
            obj.setPP(40);
            obj.setVB(30);
            obj.setOth(30);
        }
        return obj.getVB();

    }
}
