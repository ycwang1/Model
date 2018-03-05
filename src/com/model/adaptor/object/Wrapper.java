package com.model.adaptor.object;

import com.model.adaptor.Source;
import com.model.adaptor.Targetable;
/**
 * ����������ģʽ
 * ���޸�adaptor��
 * @author wangyanchao
 *
 */
public class Wrapper implements Targetable {
	private Source source;

	public Wrapper(Source source){
		super();
		this.source = source;
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!");
	}

}
