package com.GoogleApi.apis.Dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Values
{
    public int inclusion;
    public int mettle;
    public int pioneering;
    public int accountability;
    public int collaboration;
    public int trust;


    public int getInclusion() {
        return inclusion;
    }

    public void setInclusion(int inclusion) {
        this.inclusion = inclusion;
    }

    public int getMettle() {
        return mettle;
    }

    public void setMettle(int mettle) {
        this.mettle = mettle;
    }

    public int getPioneering() {
        return pioneering;
    }

    public void setPioneering(int pioneering) {
        this.pioneering = pioneering;
    }

    public int getAccountability() {
        return accountability;
    }

    public void setAccountability(int accountability) {
        this.accountability = accountability;
    }

    public int getCollaboration() {
        return collaboration;
    }

    public void setCollaboration(int collaboration) {
        this.collaboration = collaboration;
    }

    public int getTrust() {
        return trust;
    }

    public void setTrust(int trust) {
        this.trust = trust;
    }




}