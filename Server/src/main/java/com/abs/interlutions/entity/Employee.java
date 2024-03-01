package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String  employeeName;
    private String  designation;
    private String  email;
    private String  username;
    private String  password;
    private Boolean enabled;

    public Employee()
    {
        super();
    }

    public Employee(String employeeName, String designation, String email, String username, String password,
            Boolean enabled)
    {
        super();
        this.employeeName = employeeName;
        this.designation = designation;
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public Integer getEmployeeId()
    {
        return employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Boolean getEnabled()
    {
        return enabled;
    }

    public void setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
    }

}
