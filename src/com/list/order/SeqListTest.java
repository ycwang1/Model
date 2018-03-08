package com.list.order;

public class SeqListTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		orderListTest();
		//SingleLinkedListTest();
	}
	/**
	 * 顺序表测试
	 * @throws Exception
	 */
	private static void orderListTest() throws Exception{
		SeqList seqList = new SeqList(100);
		System.out.println("原始线性表:");
		for(int i=0;i<10;i++){
			seqList.insert(i, new Integer(i));
			System.out.print(seqList.getData(i)+" ");
		}
		System.out.println();
		System.out.println("插入一个元素后：");
		seqList.insert(4, new Integer(9));
		for (int i = 0; i < seqList.getSize(); i++) {
			System.out.print(seqList.getData(i)+" ");
		}
		System.out.println();
		System.out.println("删除一个元素后：");
		seqList.delete(7);
		for (int i = 0; i < seqList.getSize(); i++) {
			System.out.print(seqList.getData(i)+" ");
		}
	}
	/**
	 * 单链表测试
	 */
	private static void SingleLinkedListTest(){
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		System.out.println("初始线性表");
		for(int i=0;i<10;i++){
			singleLinkedList.insert(i, new Integer(i));
		}
		singleLinkedList.print();
		System.out.println("初始线性表长度："+singleLinkedList.getSize());
		
		System.out.println("在位置4插入元素9后的线性表：");
		singleLinkedList.insert(4, new Integer(9));
		singleLinkedList.print();
		
		System.out.println("表尾插入元素0后的线性表");
		singleLinkedList.addToLast(new Integer(0));
		singleLinkedList.print();
		
		System.out.println("删除第5个元素的线性表");
		singleLinkedList.delete(5);
		singleLinkedList.print();
	}
	
}
