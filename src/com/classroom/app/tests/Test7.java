package com.classroom.app.tests;

import com.classroom.app.Interfaces.ChatRoomInterface;
import com.classroom.app.services.ChatRoomService;

/**
 * Created by Muhammad Sadiq Saeed on 4/15/2017.
 */
public class Test7 {

    public static void main(String[] args) {
        ChatRoomInterface chatRoomInterface = new ChatRoomService();

        chatRoomInterface.createSession("Java","Fundamentals of Java",0,"cxlz11");
    }

}
