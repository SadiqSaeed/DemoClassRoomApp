package com.classroom.app.services;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Muhammad Sadiq Saeed on 3/5/2017.
 */
public class EmailSenderService {

    public void sendEmail(String email) {

        String userName = "Shahab";

        String to = email;

        String from ="classroomapp2017@gmail.com";

        String host = "smtp.gmail.com";

        String password = "classroomapp123456789";

        String subject = "Verify your email address";

        String text = "Dear '"+userName+"' \n \n \n To complete your registration \n with ClassRoom please click the" +
                "\n link below to verify your email \n address \n \n \n \n \n \n If you didn't sign up; please \n" +
                " ignore this email";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.password", password);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator(){
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(
                                from, password);
                    }
                });


        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject(subject);

            message.setText(text);

            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,password);
           transport.send(message);
            System.out.println("Mail Sent Successfully");

        } catch (MessagingException mex) {
            System.err.println(mex.getMessage());
        }

    }


}
