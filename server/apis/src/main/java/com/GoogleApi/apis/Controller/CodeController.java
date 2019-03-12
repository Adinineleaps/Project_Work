package com.GoogleApi.apis.Controller;

import com.GoogleApi.apis.Dto.Weightage_code;
import com.GoogleApi.apis.Service.impl.apiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class CodeController



{
    @Autowired
    apiImpl impl;

    @GetMapping("/code")
    public int setCode(@RequestParam String code)
    {
        return impl.set_code(code);


    }

}
