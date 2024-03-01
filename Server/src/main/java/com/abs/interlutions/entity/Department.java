package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department
{

    @Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer departmentId;
    private String  departmentName;
    private Integer defaultWorkflowId;
    private Integer defaultUserId;

    public Department()
    {
        super();
    }

    public Department(String departmentName, Integer defaultWorkflowId, Integer defaultUserId)
    {
        super();
        this.departmentName = departmentName;
        this.defaultWorkflowId = defaultWorkflowId;
        this.defaultUserId = defaultUserId;
    }

    public Integer getDepartmentId()
    {
        return departmentId;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public Integer getDefaultWorkflowId()
    {
        return defaultWorkflowId;
    }

    public void setDefaultWorkflowId(Integer defaultWorkflowId)
    {
        this.defaultWorkflowId = defaultWorkflowId;
    }

    public Integer getDefaultUserId()
    {
        return defaultUserId;
    }

    public void setDefaultUserId(Integer defaultUserId)
    {
        this.defaultUserId = defaultUserId;
    }

}
