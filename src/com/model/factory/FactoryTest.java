package com.model.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}

}
