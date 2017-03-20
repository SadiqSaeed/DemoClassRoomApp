package com.classroom.app.tests;

import com.classroom.app.services.EmailSenderService;

/**
 * Created by Muhammad Sadiq Saeed on 3/5/2017.
 */
public class Test4 {

    public static void main(String[] args) {
        EmailSenderService emailSenderService = new EmailSenderService();

        emailSenderService.sendEmail("ss.sadiqsaeed@gmail.com");
    }
}
