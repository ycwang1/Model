package com.model.observer;

/**
 * 观察者模式,一个对象修改，导致所有对象都会变化。
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
