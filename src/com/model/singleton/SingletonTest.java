package com.model.singleton;

/**
 * 单例模式例子：在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
 * @author wangyanchao
 *
 */
public class SingletonTest {
	private static SingletonTest instance=null;
	private SingletonTest(){
		
	}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance = new SingletonTest();
		}
	}
	public static SingletonTest getInstance(){
		if(instance==null){
			syncInit();
		}
		return instance;
	}
}
