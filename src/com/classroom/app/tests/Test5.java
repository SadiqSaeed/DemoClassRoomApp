package com.classroom.app.tests;

import com.classroom.app.Interfaces.SignUpInterface;
import com.classroom.app.services.SignUpService;

/**
 * Created by Muhammad Sadiq Saeed on 4/3/2017.
 */
public class Test5 {

    public static void main(String[] args) {
        SignUpInterface signUpInterface = new SignUpService();

        System.out.println("Status = " + signUpInterface.checkStatus("11gd10"));

    }

}
