package com.classroom.app.Interfaces;


import com.classroom.app.model.Message;

import java.util.List;

/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public interface MessageInterface {

    void sendMessage(int messageId, String message, String author, String chatId);

    List<Message> getAllMessages(String chatRoomId);

    List<Message> getAllMessagesForYear(int year);

    List<Message> getAllMessagePaginated(int start, int size);

    Message getMessage(int id);

}
