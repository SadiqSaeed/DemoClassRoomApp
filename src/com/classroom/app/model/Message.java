package com.classroom.app.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
@XmlRootElement
public class Message {

    private int messageId;
    private String message;
    private Timestamp createdAt;
    private String author;
    private String chatId;

    public Message() {

    }

    public Message(int messageId, String message, String author, String chatId) {
        this.messageId = messageId;
        this.message = message;
        this.author = author;
        this.chatId = chatId;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
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
                ", recipient='" + chatId + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
