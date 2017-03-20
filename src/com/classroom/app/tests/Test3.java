package com.classroom.app.tests;

import com.classroom.app.Interfaces.SignUpInterface;
import com.classroom.app.services.SignUpService;

/**
 * Created by Muhammad Sadiq Saeed on 3/5/2017.
 */
public class Test3 {

    public static void main(String[] args) {

        SignUpInterface signUpInterface = new SignUpService();

        System.out.println(signUpInterface.updateUserData("11gd10","Shahab ahmed","1234567"));

    }

}
