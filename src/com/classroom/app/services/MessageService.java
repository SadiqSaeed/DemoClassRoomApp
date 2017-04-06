package com.classroom.app.services;

import com.classroom.app.Interfaces.MessageInterface;
import com.classroom.app.database.DBConnection;
import com.classroom.app.model.Message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Created by Muhammad Sadiq Saeed on 4/5/2017.
 */
public class MessageService implements MessageInterface {

    private Connection con = null;
    private DBConnection dbConnection;
    private Message messageClass;
    private Statement statement;
    private ResultSet resultSet;


    @Override
    public void sendMessage(int messageId, String message, String recipient, String author) {
        dbConnection = new DBConnection();
        messageClass = new Message(messageId, message, recipient, author);
        try {
            con = dbConnection.openConnection();
            statement = con.createStatement();

            String query = "Insert into messages(messageId, message, recipient , author) Values ('" + messageClass.getMessageId() + "'," +
                    "'" + messageClass.getMessage() + "', '" + messageClass.getRecipient() + "', '" + messageClass.getAuthor() + "')";

            if (!(messageClass.getMessage().equals("") && messageClass.getRecipient().equals("") && messageClass.getAuthor().equals(""))) {
                statement.execute(query);
                System.out.println("Message sent Successfully!!! ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            dbConnection.closeConnection(con);
        }
    }
}
