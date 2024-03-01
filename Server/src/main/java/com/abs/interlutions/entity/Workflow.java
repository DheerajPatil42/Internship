package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workflow
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workflowId;
    private String  workflowName;

    public Workflow()
    {
        super();
    }

    public Workflow(String workflowName)
    {
        this.workflowName = workflowName;
    }

    public Integer getWorkflowId()
    {
        return workflowId;
    }

    public String getWorkflowName()
    {
        return workflowName;
    }

    public void setWorkflowName(String workflowName)
    {
        this.workflowName = workflowName;
    }

}
