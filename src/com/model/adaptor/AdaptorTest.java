package com.model.adaptor;
/*类的适配器模式：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里*/
public class AdaptorTest {
	public static void main(String [] args){
		Targetable target = new Adaptor();
		target.method1();
		target.method2();
	}
}
