package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WorkflowStates
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stateId;
    private Integer workflowId;
    private Integer stateSerialNo;
    private String  workflowState;
    private Integer mappedTo;

    public WorkflowStates()
    {
        super();
    }

    public WorkflowStates(Integer workflowId, Integer stateSerialNo, String workflowState, Integer mappedTo)
    {
        this.workflowId = workflowId;
        this.stateSerialNo = stateSerialNo;
        this.workflowState = workflowState;
        this.mappedTo = mappedTo;
    }

    public Integer getStateId()
    {
        return stateId;
    }

    public Integer getWorkflowId()
    {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId)
    {
        this.workflowId = workflowId;
    }

    public Integer getStateSerialNo()
    {
        return stateSerialNo;
    }

    public void setStateSerialNo(Integer stateSerialNo)
    {
        this.stateSerialNo = stateSerialNo;
    }

    public String getWorkflowState()
    {
        return workflowState;
    }

    public void setWorkflowState(String workflowState)
    {
        this.workflowState = workflowState;
    }

    public Integer getMappedTo()
    {
        return mappedTo;
    }

    public void setMappedTo(Integer mappedTo)
    {
        this.mappedTo = mappedTo;
    }

}
