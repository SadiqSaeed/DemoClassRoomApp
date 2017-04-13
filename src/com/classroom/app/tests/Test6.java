package com.classroom.app.tests;

import com.classroom.app.Interfaces.MessageInterface;
import com.classroom.app.model.Message;
import com.classroom.app.services.MessageService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public class Test6 {

    public static void main(String[] args) {
        MessageInterface messageInterface = new MessageService();

        //messageInterface.sendMessage(1, "Hai man whats up", "Sadiq Saeed", "cxlz11");

        List<Message> messageList;

        messageList = messageInterface.getAllMessages();

        for (Message m : messageList) {
            System.out.println(" " + m);
        }


    }
}
