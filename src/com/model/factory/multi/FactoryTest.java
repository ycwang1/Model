package com.model.factory.multi;

import com.model.factory.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.send();
	}

}
