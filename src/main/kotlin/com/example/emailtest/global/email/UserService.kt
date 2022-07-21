package com.example.emailtest.global.email

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class UserService(
    private var javaMailSender: JavaMailSender
){

    fun sendSimpleMesssage(
        to: String,
        subject: String,
        text: String
    ){
        val message = SimpleMailMessage()
        message.setFrom("noreply@baeldung.com")
        message.setTo(to)
        message.setSubject(subject)
        message.setText(text)
        javaMailSender.send(message)
    }
}