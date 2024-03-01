package com.abs.interlutions.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer       ticketId;
    private String        title;
    private LocalDateTime createdDate;
    private LocalDateTime closedDate;
    private String        ticketDescription;
    private Integer       raisedById;
    private Integer       departmentId;
    private Integer       assignToId;
    private Integer       ticketTypeId;
    private Integer       priorityId;
    private Integer       stateId;

    public Ticket()
    {
        super();
    }

    public Ticket(String title, LocalDateTime createdDate, LocalDateTime closedDate, String ticketDescription,
            Integer raisedById, Integer departmentId, Integer assignToId, Integer ticketTypeId, Integer priorityId,
            Integer stateId)
    {
        super();
        this.title = title;
        this.createdDate = createdDate;
        this.closedDate = closedDate;
        this.ticketDescription = ticketDescription;
        this.raisedById = raisedById;
        this.departmentId = departmentId;
        this.assignToId = assignToId;
        this.ticketTypeId = ticketTypeId;
        this.priorityId = priorityId;
        this.stateId = stateId;
    }

    public Integer getTicketId()
    {
        return ticketId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public LocalDateTime getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate)
    {
        this.createdDate = createdDate;
    }

    public LocalDateTime getClosedDate()
    {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate)
    {
        this.closedDate = closedDate;
    }

    public String getTicketDescription()
    {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription)
    {
        this.ticketDescription = ticketDescription;
    }

    public Integer getRaisedById()
    {
        return raisedById;
    }

    public void setRaisedById(Integer raisedById)
    {
        this.raisedById = raisedById;
    }

    public Integer getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId)
    {
        this.departmentId = departmentId;
    }

    public Integer getAssignedToId()
    {
        return assignToId;
    }

    public void setAssignedToId(Integer assignToId)
    {
        this.assignToId = assignToId;
    }

    public Integer getTicketTypeId()
    {
        return ticketTypeId;
    }

    public void setTicketTypeId(Integer ticketTypeId)
    {
        this.ticketTypeId = ticketTypeId;
    }

    public Integer getPriorityId()
    {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId)
    {
        this.priorityId = priorityId;
    }

    public Integer getStateId()
    {
        return stateId;
    }

    public void setStateId(Integer stateId)
    {
        this.stateId = stateId;
    }

}
