package com.model.facade.nouse;
/**
 * �ͻ��˶���
 * @author wangyanchao
 *δʹ������ģʽ�����������󡣲������ϵͳ
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
		/*Client������Ҫ���õ����е�¼���(Camera)�����(Light)����Ӧ��(Sensor)�;�����(Alarm)����*/
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
