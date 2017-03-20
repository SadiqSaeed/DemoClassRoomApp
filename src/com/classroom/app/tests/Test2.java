package com.classroom.app.tests;

import com.classroom.app.Interfaces.SignUpInterface;
import com.classroom.app.model.SignUp;
import com.classroom.app.services.SignUpService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Sadiq Saeed on 3/5/2017.
 */
public class Test2 {

    public static void main(String[] args) {
        SignUpInterface signUpInterface = new SignUpService();

        List<SignUp> userData = new ArrayList<>();

        userData = signUpInterface.getUserData("Shahab");

        for (int i=0; i<userData.size(); i++) {
            System.out.println(" " + userData);
        }

    }

}
