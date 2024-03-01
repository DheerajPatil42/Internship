package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DepartmentUsers
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private Integer departmentId;

    public DepartmentUsers()
    {
        super();
    }

    public DepartmentUsers(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId()
    {
        return employeeId;
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
