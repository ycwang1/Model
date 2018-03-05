package com.model.factory.multi;

import com.model.factory.MailSender;
import com.model.factory.Sender;
import com.model.factory.SmsSender;
/**
 * �������ģʽ
 * @author wangyanchao
 *
 */
public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}
}
