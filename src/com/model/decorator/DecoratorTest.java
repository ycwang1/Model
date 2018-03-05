package com.model.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
