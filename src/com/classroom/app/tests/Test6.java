package com.classroom.app.tests;

import com.classroom.app.Interfaces.MessageInterface;
import com.classroom.app.services.MessageService;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public class Test6 {

    public static void main(String[] args) {
        MessageInterface messageInterface = new MessageService();

        messageInterface.sendMessage(1, "Hai man whats up", "Sadiq Saeed", "cxlz11");
    }
}
