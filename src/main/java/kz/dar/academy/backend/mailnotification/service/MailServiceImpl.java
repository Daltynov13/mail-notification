package kz.dar.academy.backend.mailnotification.service;

import kz.dar.academy.backend.mailnotification.MailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

  @Autowired
  private JavaMailSender javaMailSender;

  @Override
  public void sendMail(MailModel message) {
    SimpleMailMessage smm = new SimpleMailMessage();
    smm.setFrom(message.getFrom());
    smm.setTo(message.getTo());
    smm.setSubject(message.getSubject());
    smm.setText(message.getText());
    javaMailSender.send(smm);
  }
}
