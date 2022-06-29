package kz.dar.academy.backend.mailnotification.service;

import kz.dar.academy.backend.mailnotification.MailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MailConsumer {

  @Autowired
  private MailService mailService;

  @KafkaListener(topics = "employees", groupId = "employees_group")
  public void consumeEmployeesMail(MailModel message) {
    mailService.sendMail(message);
  }

  @KafkaListener(topics = "clients", groupId = "clients_group")
  public void consumeClientsMail(MailModel message) {
    mailService.sendMail(message);
  }
}
