package kz.dar.academy.backend.mailnotification;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailModel implements Serializable {
  String from;
  String to;
  String subject;
  String text;
}
