package com.model.factory.staticfac;

import com.model.factory.Sender;
/**
 * ��̬����ģʽ
 * @author wangyanchao
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = SenderFactory.produceMail();
		sender.send();
	}

}
