package com.list.order;
/**
 * ���������
 * �ŵ㣺1������ҪԤ�ȸ���Ԫ�ظ��� 2�����������ɾ������Ҫ�ƶ�����Ԫ��
 * ȱ�㣺1��ÿ�������ָ�룬�ռ������ʵ� 2��������֧�������ȡ����
 * @author wangyanchao
 *
 */
public class SingleLinkedList {
	private Node head;//������ͷ���
	private Node current;//��ǰ���
	private int size;//������
	public SingleLinkedList(){
		head = current = new Node(null);//��ʼʱ��head��current����ͷָ�룬����һ���Ϊͷ��㣬��������Ϊ�ա�
		size = 0;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public int getSize(){
		return size;
	}
	/**
	 * �ڱ�β������
	 * @param obj
	 */
	public void addToLast(Object obj){
		Node newNode = new Node(obj);
		current = head.next;
		while(current.next != null){
			current = current.next;//�õ���ǰβ�ڵ�
		}
		current.next = newNode;
		newNode.next = null;
		size++;
	}
	/**
	 * ������ָ��λ�ò���
	 * ����λ��ǰһ��Node ��next�޸�Ϊ����ֵ ������ֵ��NodeΪ��λ����һ��Node
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
	 * ������ɾ��ָ��λ��
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
	 * �õ����ֵ
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
			System.out.println("����Ϊ��");
		}else{
			for(Node current=head.next;current!=null;current = current.next){
				System.out.print(current.value+" ");
			}
		}
	}
}
