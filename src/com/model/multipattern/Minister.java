package com.model.multipattern;
/**
 * 
 * @author wangyanchao
 *���Ǳ����ˣ�һ���ʵ۶��ź򲻹����ˣ����ڻ������������ʵ�
 * TND�������ˣ��ҵ����ʵۣ���ͷ���밴�ͳ��ˣ�
 */
@SuppressWarnings("all")
public class Minister {
	public static void main(String []args){
		int ministerNum= 10;//10����
		for(int i=0;i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.println("��"+i+"���󳼲μ��Ļʵ��ǣ�");
			emperor.emperorInfo();
		}
	}
}
