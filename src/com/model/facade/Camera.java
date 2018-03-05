package com.model.facade;
/**
 * Â¼Ïñ»ú¶ÔÏó¡£
 * @author wangyanchao
 *
 */
public class Camera {
	public void turnOn(){
		System.out.println("Turning on the camera");
	}
	public void turnOff(){
		System.out.println("Turning off the camera");
	}
	public void totate(int degree){
		System.out.println("Rotating the camera by {0}"+degree+" degrees");
	}
}
