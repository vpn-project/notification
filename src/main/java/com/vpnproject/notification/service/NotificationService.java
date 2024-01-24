package com.vpnproject.notification.service;

import com.vpnproject.notification.dto.NotificationDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationService {

    private JavaMailSender emailSender;

    public void sendNotificationViaEmail(NotificationDto notificationDto) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo("elopatov74@outlook.com");
        simpleMailMessage.setSubject("Subject");
        simpleMailMessage.setText("Hello, " + notificationDto.getUsername());
        emailSender.send(simpleMailMessage);
        System.out.println("Get notification" + notificationDto.toString());
    }
}
