package com.cmq.util.email;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Message.RecipientType;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

	private static Email email=null;
	private Message message;
	private static  Author a;
	private static  Properties p;
	//单例模式
	private Email(Author a,Properties p){
		this.a=a;
		this.p=p;
		Session session=Session.getDefaultInstance(p,a);
		message=new MimeMessage(session);
	}
	
	public static Email getEmail(){
		if(email==null){
			email=new Email(a,p);
		}
		return email;
	}
	public void sendMail(String stu_email,String stu_nameMd5,String randMd5) throws AddressException, MessagingException{
		
		message.setFrom(new InternetAddress(a.getUsername()));
		message.setRecipient(RecipientType.TO,new InternetAddress(stu_email));
		message.setSentDate(new Date());
		
		message.setSubject("车迷圈邮箱验证");
		String m="<a href=\"http://www.chemiquan.com/Mail/mailVerify?stu_nameMd5="+stu_nameMd5+"&randMd5="+randMd5+"\">" +
				"http://www.chemiquan.com/Mail/mailVerify?stu_nameMd5="+stu_nameMd5+"&randMd5="+randMd5+"</a>";
		
		message.setContent(m,"text/html;charset=gb2312");
		
		Transport.send(message);
	}
}
