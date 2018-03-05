package com.model.singleton;

import java.util.Vector;

/**
 * 单例模式：影子实例的办法为单例对象的属性同步更新
 * @author wangyanchao
 *
 */
public class SingletonShade {
	private static SingletonShade instance = null;
	private Vector properties=null;
	
	private Vector getProperties(){
		return properties;
	}
	private SingletonShade(){
		
	}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance = new SingletonShade();
		}
	}
	public static SingletonShade getInstance(){
		if(instance==null){
			syncInit();
		}
		return instance;
	}
	
	public void updateProperties(){
		SingletonShade shadow = new SingletonShade();
		properties = shadow.getProperties();
	}
}
