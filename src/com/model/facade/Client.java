package com.model.facade;
/**
 * �ͻ��˶���
 * @author wangyanchao
 *ʹ������ģʽ��������SecurityFacade ����
 */
public class Client {
	private static SecurityFacade security;
	public static void main(String[] args){
		security = new SecurityFacade();
		security.activate();
		System.out.println("\n----------------------\n");
		security.deActivate();
	}
}
