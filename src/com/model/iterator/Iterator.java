package com.model.iterator;

public interface Iterator {

	//前移
	public Object previous();
	//后移
	public Object next();
	public boolean hasnext();
	//获取第一个元素
	public Object first();
}
