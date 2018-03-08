package com.list.order;
/**
 * 顺序表对象：以数组为例
 * 优点：支持随机读取，内存空间利用率高
 * 缺点：1、需要预先给出最大数据元素个数  2、插入和删除需要移动大量数据
 * @author wangyanchao
 *
 */
public class SeqList {
	private int maxSize;//分配空间
	private int size;//长度
	private Object[] arrayList;//对象值
	public SeqList(int sz) {
		maxSize = sz;
		size = 0;
		arrayList = new Object[sz];
	}
	/**
	 * 顺序表的插入
	 * @param i	位置
	 * @param obj	对象
	 */
	public void insert (int i,Object obj)throws Exception{
		if(size==maxSize){
			throw new Exception("顺序表已满，无法插入！");
		}
		if(i<0||i>size){
			throw new Exception("插入位置不存在");
		}
		for(int j=size;j>i;j--){//数据后移
			arrayList[j]=arrayList[j-1];
		}
		arrayList[i]=obj;
		size++;
	}
	/**
	 * 顺序表删除
	 * @param i	位置
	 * @return obj 删除的值
	 * @throws Exception
	 */
	public Object delete(int i) throws Exception{
		if(size==0){
			throw new Exception("顺序表已为空");
		}
		if(i<0||i>size){
			throw new Exception("删除位置不存在");
		}
		Object obj = arrayList[i];
		for(int j=i;j<size;j++){//位置i后面的数据前移
			arrayList[j]=arrayList[j+1];
		}
		size--;
		return obj;
	}
	/**
	 * 取值
	 * @param i 位置
	 * @return 该位置的值
	 * @throws Exception
	 */
	public Object getData(int i)throws Exception{
		if(i<0||i>size){
			throw new Exception("该位置不存在！");
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
