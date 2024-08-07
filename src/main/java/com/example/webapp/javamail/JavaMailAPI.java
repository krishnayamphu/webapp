package com.example.webapp.javamail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class JavaMailAPI {
    public static void send(){
        String host = "mail.aptechlalitpur.com";
        final String user = "test@aptechlalitpur.com";
        final String password = "JhZA_32^s-aj";
        String to = "krishnayamphu@gmail.com";

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });

        //Compose the message
        String name="Test User";
        String msg="hello java mail api testing.";
        String email="test@aptechlalitpur.com";
        String subject="Testing Java Mail API";
        try {
            String data=name+" ,"+email+","+msg;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(data);

            //send the message
            Transport.send(message);
            System.out.println("message sent successfully...");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
