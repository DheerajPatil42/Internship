package com.abs.interlutions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Attachment
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachmentId;
    private String  attachmentName;
    private Integer ticketId;
    private String  attachmentPath;

    public Attachment()
    {
        super();
    }

    public Attachment(String attachmentName, Integer ticketId, String attachmentPath)
    {
        this.attachmentName = attachmentName;
        this.ticketId = ticketId;
        this.attachmentPath = attachmentPath;
    }

    public Integer getAttachmentId()
    {
        return attachmentId;
    }

    public String getAttachmentName()
    {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName)
    {
        this.attachmentName = attachmentName;
    }

    public Integer getTicketId()
    {
        return ticketId;
    }

    public void setTicketId(Integer ticketId)
    {
        this.ticketId = ticketId;
    }

    public String getAttachmentPath()
    {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath)
    {
        this.attachmentPath = attachmentPath;
    }
}
