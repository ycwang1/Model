package com.model.adaptor.interfaceada;
/**
 * 接口的抽象模式，使用抽象类实现接口， 类继承抽象类，重写抽象类中的方法
 * @author wangyanchao
 *
 */
public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source1 = new Sourceable1(); 
		Sourceable source2 = new Sourceable2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}

}
