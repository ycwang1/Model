package com.model.strategy;
/**
 * 策略模式实现类
 * @author wangyanchao
 *
 */
public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[]=split(exp,"\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
