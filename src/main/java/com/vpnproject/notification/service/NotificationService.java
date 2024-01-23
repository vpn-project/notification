package com.vpnproject.notification.service;

import com.vpnproject.notification.dto.NotificationDto;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotificationViaEmail(NotificationDto notificationDto) {

        System.out.println("Get notification" + notificationDto.toString());
    }
}
