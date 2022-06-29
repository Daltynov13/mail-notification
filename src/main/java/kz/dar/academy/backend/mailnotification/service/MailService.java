package kz.dar.academy.backend.mailnotification.service;

import kz.dar.academy.backend.mailnotification.MailModel;

public interface MailService {

  void sendMail(MailModel message);
}
