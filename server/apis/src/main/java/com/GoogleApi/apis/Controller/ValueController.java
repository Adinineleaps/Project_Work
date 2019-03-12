package com.GoogleApi.apis.Controller;


import com.GoogleApi.apis.Dto.Values;
import com.GoogleApi.apis.Service.impl.apiImpl;
import com.GoogleApi.apis.Service.impl.valueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValueController
{
    @Autowired
    com.GoogleApi.apis.Service.impl.valueService val;
    // apiImpl impl;
    //@RequestMapping("/values")
    @ResponseBody
    @PostMapping(value = "/values")
    public int getValues(@RequestBody Values value)

    {
        return val.sum(value);
    }

}
