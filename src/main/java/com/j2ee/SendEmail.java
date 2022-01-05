package com.j2ee;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.j2ee.ticketing.entities.Users;
import com.j2ee.ticketing.entities.Tickets;

public class SendEmail  {
 public static Users sendMail(String email, String status) {
 // Add recipient
	 
 String to = email;

// Add sender
 String from = "ticketi@auto.com";
 final String username = "antoinemousset1999@gmail.com";//your Gmail username 
 final String password = "dfzbcdigrromeuvt";//your Gmail password

String host = "smtp.gmail.com";

Properties props = new Properties();
 props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.starttls.enable", "true"); 
 props.put("mail.smtp.host", host);
 props.put("mail.smtp.port", "587");

// Get the Session object
 Session session = Session.getInstance(props,
 new javax.mail.Authenticator() {
 protected PasswordAuthentication getPasswordAuthentication() {
 return new PasswordAuthentication(username, password);
 }
 });

try {
 // Create a default MimeMessage object
 Message message = new MimeMessage(session);
 
 message.setFrom(new InternetAddress(from));
 
 message.setRecipients(Message.RecipientType.TO,
 InternetAddress.parse(to));
 
 // Set Subject
 message.setSubject("Mail from Ticketi");

 
 // Put the content of your message
 String newLine = System.getProperty("line.separator");
 if (status.equals("done") ) {
	 message.setText("Bonjour, "
		 		+ newLine + "Votre ticket à été traité"
		 		+ newLine + "Cordialement."
		 		+ newLine + "Société Ticketi");
 }
 else if (status.equals("pending")){
	 message.setText("Bonjour, "
	 		+ newLine + "Votre ticket est en cours de traitement"
	 		+ newLine + "Cordialement."
	 		+ newLine + "Société Ticketi");
 }
 else {
	 System.out.println("The status doesn't exist");
 }

// Send message
 Transport.send(message);

System.out.println("Sent message successfully....");

} catch (MessagingException e) {
 throw new RuntimeException(e);
 }
return null;
 }
}