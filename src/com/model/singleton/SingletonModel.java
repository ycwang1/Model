package com.model.singleton;

/**
 * 一个优秀的单例模式例子：如果构造函数时抛出异常，实例将永远得不到创建，也会出错。
 * @author wangyanchao
 *
 */
public class SingletonModel {
	/*私有构造放方法，防止被实例化*/
	private SingletonModel(){
		
	}
	/*此处使用一个内部类来维护单例*/
	private static class SingletonFactory{
		private static SingletonModel instance = new SingletonModel(); 
	}
	/* 获取实例 */
	public static SingletonModel getInstance(){
		return SingletonFactory.instance;
	}
	 /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */ 
	public Object readResolve(){
		return getInstance();
	}
}
