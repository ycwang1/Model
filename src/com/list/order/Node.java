package com.list.order;
/**
 * 链表结点对象
 * @author wangyanchao
 *
 */
public class Node {
	Object value;//结点数据值
	Node next;//下一个结点对象的引用
	public Node(Object value,Node next){//一般结点的构造函数
		super();
		this.value = value;
		this.next = next;
	}
	public Node(Object value){//单链表尾结点
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
