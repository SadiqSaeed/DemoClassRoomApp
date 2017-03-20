package com.classroom.app.tests;


import com.classroom.app.Interfaces.SignUpInterface;
import com.classroom.app.services.SignUpService;

/**
 * Created by Muhammad Sadiq Saeed on 3/4/2017.
 */
public class Test1 {

    public static void main(String[] args) {
        SignUpInterface signUp = new SignUpService();
        System.out.println(signUp.createUser("Shahab ", "shahab@gmail.com", "12345"));
    }

}
