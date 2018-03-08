package com.list.order;
/**
 * ˳������������Ϊ��
 * �ŵ㣺֧�������ȡ���ڴ�ռ������ʸ�
 * ȱ�㣺1����ҪԤ�ȸ����������Ԫ�ظ���  2�������ɾ����Ҫ�ƶ���������
 * @author wangyanchao
 *
 */
public class SeqList {
	private int maxSize;//����ռ�
	private int size;//����
	private Object[] arrayList;//����ֵ
	public SeqList(int sz) {
		maxSize = sz;
		size = 0;
		arrayList = new Object[sz];
	}
	/**
	 * ˳���Ĳ���
	 * @param i	λ��
	 * @param obj	����
	 */
	public void insert (int i,Object obj)throws Exception{
		if(size==maxSize){
			throw new Exception("˳����������޷����룡");
		}
		if(i<0||i>size){
			throw new Exception("����λ�ò�����");
		}
		for(int j=size;j>i;j--){//���ݺ���
			arrayList[j]=arrayList[j-1];
		}
		arrayList[i]=obj;
		size++;
	}
	/**
	 * ˳���ɾ��
	 * @param i	λ��
	 * @return obj ɾ����ֵ
	 * @throws Exception
	 */
	public Object delete(int i) throws Exception{
		if(size==0){
			throw new Exception("˳�����Ϊ��");
		}
		if(i<0||i>size){
			throw new Exception("ɾ��λ�ò�����");
		}
		Object obj = arrayList[i];
		for(int j=i;j<size;j++){//λ��i���������ǰ��
			arrayList[j]=arrayList[j+1];
		}
		size--;
		return obj;
	}
	/**
	 * ȡֵ
	 * @param i λ��
	 * @return ��λ�õ�ֵ
	 * @throws Exception
	 */
	public Object getData(int i)throws Exception{
		if(i<0||i>size){
			throw new Exception("��λ�ò����ڣ�");
		}
		return arrayList[i];
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
}
