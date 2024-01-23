package com.vpnproject.notification.controller;

import com.vpnproject.notification.dto.NotificationDto;
import com.vpnproject.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/test")
    public String testMethod() {
        return "String";
    }

    @KafkaListener(topics = "notification_topic")
    public void notificationFromKafka(@Payload NotificationDto notificationDto) {
        notificationService.sendNotificationViaEmail(notificationDto);
    }
}
