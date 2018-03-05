package com.model.commond;
/**
 * 命令模式属于一级一级的执行。 
 * @author wangyanchao
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}

}
