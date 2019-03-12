package com.GoogleApi.apis.Dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Weightage_code {
    public String code;
    public int PP;
    public int VB;
    public int Oth;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getVB() {
        return VB;
    }

    public void setVB(int VB) {
        this.VB = VB;
    }

    public int getOth() {
        return Oth;
    }

    public void setOth(int oth) {
        Oth = oth;
    }
    }
