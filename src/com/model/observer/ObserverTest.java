package com.model.observer;

/**
 * �۲���ģʽ,һ�������޸ģ��������ж��󶼻�仯��
 * @author wangyanchao
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}

}