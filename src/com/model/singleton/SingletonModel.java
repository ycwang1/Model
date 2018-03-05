package com.model.singleton;

/**
 * һ������ĵ���ģʽ���ӣ�������캯��ʱ�׳��쳣��ʵ������Զ�ò���������Ҳ�����
 * @author wangyanchao
 *
 */
public class SingletonModel {
	/*˽�й���ŷ�������ֹ��ʵ����*/
	private SingletonModel(){
		
	}
	/*�˴�ʹ��һ���ڲ�����ά������*/
	private static class SingletonFactory{
		private static SingletonModel instance = new SingletonModel(); 
	}
	/* ��ȡʵ�� */
	public static SingletonModel getInstance(){
		return SingletonFactory.instance;
	}
	 /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */ 
	public Object readResolve(){
		return getInstance();
	}
}
