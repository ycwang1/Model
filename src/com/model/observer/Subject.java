package com.model.observer;

public interface Subject {
	//���ӹ۲���
	public void add(Observer observer);
	//ɾ���۲���
	public void delete(Observer observer);
	//֪ͨ�۲���
	public void notifyObservers();
	//����Ĳ���
	public void operation();
}
