package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3();
	}
	/** 
	  *  �����ַ�������len1���ַ���s1���ַ�������len2���ַ���s2���Ӻ���ǰ�Ƚϣ�������ַ���Ϊ��׼�������ͬ��Ԫ�صĸ����� ����:  ���룺s1="1,3,5"   len1=3        s2="2,4,1,7,5"   len2=5   
	            �����1  
	  
	    ����ԭ�� public int getDiffNum(int len1, String s1, int len2, String s2) 
	    �˳���ֻ��Ա�������
	  * @author sheepmu 
	  * 
	  */  
	public static void Test1(){
		String s2 = "1,3,5,";
		int len2 = 4;
		String s1 = "2,4,1,7,5";
		int len1 = 5;
		String str1[] = s1.split(",");
		String str2[] = s2.split(",");
		int len=len1>len2?len2:len1;
		int count = 0;
		for(int i=0;i<len;i++){
			if(!str1[len1-1-i].equals(str2[len2-1-i])){
				count++;
			}
		}
		System.out.println(count);
	}
	/**** 
	 *����һ�����ʽ��û�����ţ�����С��0-9֮�䣬��������������е��м�����Ϊ���Ρ� 
	  
	    ����:  ���룺3+8��2/9-2   
	            �����2   
	  
	    ����ԭ��  . public int getMyRet(String str)   
	 * @author sheepmu 
	 * 
	 */
	public static void Test2(){
		String s = "3+8��2/9-2";
		for(int i=0;i<s.length();i++){			
			System.out.println(s.charAt(i));
		}
	}
	public static void Test3(){
		Map<String,String> map=new HashMap<String,String>();  
        map.put("key1", "bb");  
        map.put("key0", "aaa");      
        map.put("key3", "dddd");      
        map.put("key2", "cccccccc");  
          
        //���� hashmap  
        for(Map.Entry<String, String> entry:map.entrySet())   
        {  
            String key= entry.getKey().toString();  
            String value=entry.getValue().toString();  
            System.out.println("key---->"+key+"    value---->"+value+"   ");  
        }  
        //��Ҫ������hashmap  
        List<Map.Entry<String, String>> list=new ArrayList<Map.Entry<String, String>>(map.entrySet());//!!!  
         Collections.sort(list, new Comparator<Map.Entry<String, String>>(){//��keyֵ�ַ����Ƚϴ�С����  
           @Override  
           public int compare(Entry<String, String> o1,Entry<String, String> o2) {    
               return o1.getKey().compareTo(o2.getKey());  
           }});  
           
         System.out.println("list---->"+list);  
           
         Collections.sort(list, new Comparator<Map.Entry<String, String>>(){//��valueֵ�ַ������ȱȽϴӴ�С  
               @Override  
               public int compare(Entry<String, String> o1,Entry<String, String> o2) {                
                   return o2.getValue().length()-o1.getValue().length();  
               }});  
               
             System.out.println("list---->"+list);  
     
	}
}
