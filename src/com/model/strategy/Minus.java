package com.model.strategy;
/**
 * ����ģʽʵ����
 * @author wangyanchao
 *
 */
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[]=split(exp,"-");
		return arrayInt[0]-arrayInt[1];
	}

}