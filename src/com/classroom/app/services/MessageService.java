package com.classroom.app.services;

import com.classroom.app.Interfaces.MessageInterface;
import com.classroom.app.database.DBConnection;
import com.classroom.app.model.Message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public class MessageService implements MessageInterface {

    private Connection con = null;
    private DBConnection dbConnection;
    private Message messageClass;
    private Statement statement;
    private ResultSet resultSet;
    private String query;
    private List<Message> messageList;


    @Override
    public void sendMessage(int messageId, String message, String recipient, String author) {
        dbConnection = new DBConnection();
        messageClass = new Message(messageId, message, recipient, author);
        try {
            con = dbConnection.openConnection();
            statement = con.createStatement();

            query = "Insert into messages(messageId, message, recipient , author) Values ('" + messageClass.getMessageId() + "'," +
                    "'" + messageClass.getMessage() + "', '" + messageClass.getRecipient() + "', '" + messageClass.getAuthor() + "')";

            if (!(messageClass.getMessage().equals("") && messageClass.getRecipient().equals("") && messageClass.getAuthor().equals(""))) {
                statement.execute(query);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
                dbConnection.closeConnection(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Message> getAllMessages(String chatRoomId) {
        messageList = new ArrayList<>();
        dbConnection = new DBConnection();
        try {
            con = dbConnection.openConnection();
            statement = con.createStatement();

            query = "Select * from messages";

            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                messageClass = new Message();
                messageClass.setMessageId(resultSet.getInt("messageId"));
                messageClass.setMessage(resultSet.getString("message"));
                messageClass.setCreatedAt(resultSet.getTimestamp("createdAt"));
                messageClass.setRecipient(resultSet.getString("recipient"));
                messageClass.setAuthor(resultSet.getString("author"));
                messageList.add(messageClass);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                resultSet.close();
                dbConnection.closeConnection(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return messageList;
    }

    @Override
    public List<Message> getAllMessagesForYear(int year) {
        return null;
    }

    @Override
    public List<Message> getAllMessagePaginated(int start, int size) {
        return null;
    }

    @Override
    public Message getMessage(int id) {
        return null;
    }
}
