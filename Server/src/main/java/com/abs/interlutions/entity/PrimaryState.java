package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PrimaryState
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stateId;
    private String  stateName;

    public PrimaryState()
    {
        super();
    }

    public PrimaryState(String stateName)
    {
        this.stateName = stateName;
    }

    public Integer getStateId()
    {
        return stateId;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

}
