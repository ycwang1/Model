package com.list.order;
/**
 * ���������
 * @author wangyanchao
 *
 */
public class Node {
	Object value;//�������ֵ
	Node next;//��һ�������������
	public Node(Object value,Node next){//һ����Ĺ��캯��
		super();
		this.value = value;
		this.next = next;
	}
	public Node(Object value){//������β���
		this(value,null);
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String toString() {
		return value.toString();
	}
	
}
