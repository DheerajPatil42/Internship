package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Priority
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer priorityId;
    private String  priorityName;

    public Priority()
    {
        super();
    }

    public Priority(String priorityName)
    {
        this.priorityName = priorityName;
    }

    public Integer getPriorityId()
    {
        return priorityId;
    }

    public String getPriorityName()
    {
        return priorityName;
    }

    public void setPriorityName(String priorityName)
    {
        this.priorityName = priorityName;
    }

}
