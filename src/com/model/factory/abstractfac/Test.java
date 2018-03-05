package com.model.factory.abstractfac;
/**
 * 抽象工厂模式测试
 * @author wangyanchao
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}

}
