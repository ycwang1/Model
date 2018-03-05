package com.model.facade.nouse;
/**
 * 客户端对象
 * @author wangyanchao
 *未使用门面模式，引入多个对象。操作多个系统
 */
public class Client {
	private static Camera camera1,camera2;
	private static Light light1,light2,light3;
	private static Sensor sensor;
	private static Alarm alarm;
	
	Client(){
		camera1 = new Camera();
		camera2 = new Camera();
		light1 = new Light();
		light2 = new Light();
		light3 = new Light();
		sensor = new Sensor();
		alarm = new Alarm();
	}
	public static void main(String[]args){
		/*Client对象需要引用到所有的录像机(Camera)、电灯(Light)、感应器(Sensor)和警报器(Alarm)对象*/
		new Client();
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		light3.turnOn();
		sensor.activate();
		alarm.activate();
	}
}
