package com.list.order;

public class SeqListTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		orderListTest();
		//SingleLinkedListTest();
	}
	/**
	 * ˳������
	 * @throws Exception
	 */
	private static void orderListTest() throws Exception{
		SeqList seqList = new SeqList(100);
		System.out.println("ԭʼ���Ա�:");
		for(int i=0;i<10;i++){
			seqList.insert(i, new Integer(i));
			System.out.print(seqList.getData(i)+" ");
		}
		System.out.println();
		System.out.println("����һ��Ԫ�غ�");
		seqList.insert(4, new Integer(9));
		for (int i = 0; i < seqList.getSize(); i++) {
			System.out.print(seqList.getData(i)+" ");
		}
		System.out.println();
		System.out.println("ɾ��һ��Ԫ�غ�");
		seqList.delete(7);
		for (int i = 0; i < seqList.getSize(); i++) {
			System.out.print(seqList.getData(i)+" ");
		}
	}
	/**
	 * ���������
	 */
	private static void SingleLinkedListTest(){
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		System.out.println("��ʼ���Ա�");
		for(int i=0;i<10;i++){
			singleLinkedList.insert(i, new Integer(i));
		}
		singleLinkedList.print();
		System.out.println("��ʼ���Ա��ȣ�"+singleLinkedList.getSize());
		
		System.out.println("��λ��4����Ԫ��9������Ա�");
		singleLinkedList.insert(4, new Integer(9));
		singleLinkedList.print();
		
		System.out.println("��β����Ԫ��0������Ա�");
		singleLinkedList.addToLast(new Integer(0));
		singleLinkedList.print();
		
		System.out.println("ɾ����5��Ԫ�ص����Ա�");
		singleLinkedList.delete(5);
		singleLinkedList.print();
	}
	
}
