package com.model.adaptor.object;

import com.model.adaptor.Source;
import com.model.adaptor.Targetable;
/**
 * ��������������
 * @author wangyanchao
 *
 */
public class AdaptorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}

}
