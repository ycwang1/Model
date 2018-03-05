package com.model.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	private static void test1(){
		String exp="2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}

}
