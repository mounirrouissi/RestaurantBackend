package com.example.demo.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Properties;


@Component
public class FeedbackMailSender implements FeedbackSender {
    @Autowired
            private JavaMailSender javaMailSender;
 /*   private JavaMailSenderImpl mailSender;

    public FeedbackMailSender(Environment environment){




        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("mounirrouissi2@gmail.com");
        mailSender.setPassword("password");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

    }*/

    @Override
    public void sendFeedback(String from, String name, String feedback){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("mounirrouissi2@gmail.com");
        message.setSubject("New feedback from " + name);
        message.setText(feedback);
        message.setFrom(from);

        this.javaMailSender.send(message);
    }
}