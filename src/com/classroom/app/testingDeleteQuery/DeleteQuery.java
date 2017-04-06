package com.classroom.app.testingDeleteQuery;

import com.classroom.app.database.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Muhammad Sadiq Saeed on 4/6/2017.
 */
public class DeleteQuery {

    public static void main(String[] args) {
        try {
            DBConnection dbConnection = new DBConnection();
            Connection connection = dbConnection.openConnection();

            Statement statement = connection.createStatement();

            String query = "Delete From signup where id = 456123789";

            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
