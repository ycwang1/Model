package com.model.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * 建造者模式是把各个产品集中起来管理，用一个类来处理
 * @author wangyanchao
 *
 */
public class Builder {
	private List<Sender>list = new ArrayList<Sender>();
	public void porduceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
	}
}
