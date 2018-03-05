package com.model.commond;
/**
 * 司令：命令发布者
 * @author wangyanchao
 *
 */
public class Invoker {
	private Command command;
	public Invoker(Command command){
		this.command = command;
	}
	public void action(){
		command.exe();
	}
}
