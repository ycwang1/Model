package com.model.adaptor;
/*���������ģʽ����һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��
 * ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��*/
public class AdaptorTest {
	public static void main(String [] args){
		Targetable target = new Adaptor();
		target.method1();
		target.method2();
	}
}
