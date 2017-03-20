package com.classroom.app.tests;

import com.classroom.app.Interfaces.SignInInterface;
import com.classroom.app.services.SigInService;

/**
 * Created by Muhammad Sadiq Saeed on 3/5/2017.
 */
public class Test {

    public static void main(String[] args) {
        SignInInterface signInInterface = new SigInService();

        System.out.println(signInInterface.authenticateUser("ss.sadiqsaeed@gmail.com","12345678"));
    }
}
