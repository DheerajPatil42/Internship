package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TicketType
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketTypeId;
    private String  ticketTypeName;
    private Integer workflowId;
    private Integer departmentId;

    public TicketType()
    {
        super();
    }

    public TicketType(String ticketTypeName, Integer workflowId, Integer departmentId)
    {
        super();
        this.ticketTypeName = ticketTypeName;
        this.workflowId = workflowId;
        this.departmentId = departmentId;
    }

    public Integer getTicketTypeId()
    {
        return ticketTypeId;
    }

    public String getTicketTypeName()
    {
        return ticketTypeName;
    }

    public void setTicketTypeName(String ticketTypeName)
    {
        this.ticketTypeName = ticketTypeName;
    }

    public Integer getWorkflowId()
    {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId)
    {
        this.workflowId = workflowId;
    }

    public Integer getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

}
