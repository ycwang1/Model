package com.model.iterator;
/**
 * ������ģʽ��
 * ����ò��ģ����һ��������Ĺ��̣��о��ǲ��Ǻ�ˬ����ʵJDK�и�����Ҳ������Щ�����Ķ�������һЩ���ģʽ��
 * �ټ�һЩ�Ż��ŵ�һ��ģ�ֻҪ���ǰ���Щ����ѧ���ˣ����պ��ˣ�����Ҳ����д���Լ��ļ����࣬�������
 * @author wangyanchao
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while(it.hasnext()){
			System.out.println(it.next());
		}
	}

}
