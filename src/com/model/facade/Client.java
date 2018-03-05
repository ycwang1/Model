package com.model.facade;
/**
 * 客户端对象
 * @author wangyanchao
 *使用门面模式，仅操作SecurityFacade 对象
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
