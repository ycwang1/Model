package com.model.factory.staticfac;

import com.model.factory.MailSender;
import com.model.factory.Sender;
import com.model.factory.SmsSender;
/**
 * 静态工厂模式
 * @author wangyanchao
 *
 */
public class SenderFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
