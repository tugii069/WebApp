package edu.fra.uas.service;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageService {
  private static final Logger log = LoggerFactory.getLogger(MessageService.class); // Logger erstellen
  private String message;

  public String getMessage() {
    log.debug("getMessage() aufgerufen – aktuelle Nachricht: {}", message); // Log in getMessage
    return message;

  }

  public void setMessage(String message) {
    log.info("setMessage() aufgerufen – neue Nachricht wird gesetzt: {}", message); // Log in setMessage
    this.message = message;
    log.debug("Nachricht erfolgreich gesetzt: {}", this.message);
  }
}