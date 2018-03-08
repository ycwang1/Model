package com.list.order;
/**
 * 单链表对象
 * 优点：1、不需要预先给出元素个数 2、单链表插入删除不需要移动数据元素
 * 缺点：1、每个结点有指针，空间利用率低 2、单链表不支持随机读取数据
 * @author wangyanchao
 *
 */
public class SingleLinkedList {
	private Node head;//单链表头结点
	private Node current;//当前结点
	private int size;//链表长度
	public SingleLinkedList(){
		head = current = new Node(null);//初始时令head和current都是头指针，即下一结点为头结点，即数据域为空。
		size = 0;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int getSize(){
		return size;
	}
	/**
	 * 在表尾插入结点
	 * @param obj
	 */
	public void addToLast(Object obj){
		Node newNode = new Node(obj);
		current = head.next;
		while(current.next != null){
			current = current.next;//得到当前尾节点
		}
		current.next = newNode;
		newNode.next = null;
		size++;
	}
	/**
	 * 单链表指定位置插入
	 * 将该位置前一个Node 的next修改为插入值 ，插入值的Node为该位置下一个Node
	 * @param i
	 * @param obj
	 */
	public void insert(int i,Object obj){
		Node newNode = new Node(obj);
		Node pre = head;
		current = head.next;
		int j = 0;
		while(current!=null&&j<i){
			pre = current;
			current = current.next;
			j++;
		}
		newNode.next = current;
		pre.next = newNode;
		size++;
	}
	/**
	 * 单链表删除指定位置
	 * @param i
	 */
	public void delete(int i){
		Node pre = head;
		current = head.next;
		int j = 0;
		while(current.next!=null&&j<i){
			pre = current;
			current = current.next;
			j++;
		}
		pre.next = current.next;
		size--;
	}
	/**
	 * 得到结点值
	 * @param i
	 * @return
	 */
	public Object getValue(int i){
		current = head.next;
		int j = 0;
		while(current.next!=null&&j<i){
			current = current.next;
			j++;
		}
		return current.value;
	}
	public void print(){
		if(isEmpty()){
			System.out.println("链表为空");
		}else{
			for(Node current=head.next;current!=null;current = current.next){
				System.out.print(current.value+" ");
			}
		}
	}
}
