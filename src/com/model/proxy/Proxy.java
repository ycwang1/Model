package com.model.proxy;
/**
 * ����ģʽ,���޸�Source����ķ���
 * @author wangyanchao
 *
 */
public class Proxy implements Sourceable {
	private Source source;  
	public Proxy(){
		super();
		this.source=new Source();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}
	public void after(){
		System.out.println("after Proxy");
	}
	public void before(){
		System.out.println("before Proxy");
	}
}
