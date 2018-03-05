package com.model.observer;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 观察者模式抽象类
 * @author wangyanchao
 *
 */
public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}

}
