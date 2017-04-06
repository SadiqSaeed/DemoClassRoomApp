package com.classroom.app.Interfaces;


import com.classroom.app.model.Message;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public interface MessageInterface {

    void sendMessage(int messageId, String message, String recipient, String author);

}
