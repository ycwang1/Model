package com.model.adaptor.interfaceada;
/**
 * �ӿڵĳ���ģʽ��ʹ�ó�����ʵ�ֽӿڣ� ��̳г����࣬��д�������еķ���
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
