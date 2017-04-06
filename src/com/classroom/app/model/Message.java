package com.classroom.app.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
@XmlRootElement
public class Message {

    private int messageId;
    private String message;
    private Date createdAt;
    private String recipient;
    private String author;

    public Message() {

    }

    public Message(int messageId, String message, String recipient, String author) {
        this.messageId = messageId;
        this.message = message;
        this.recipient = recipient;
        this.author = author;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                ", recipient='" + recipient + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
