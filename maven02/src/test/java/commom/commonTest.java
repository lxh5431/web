package commom;

import org.junit.Test;

import base.BaseControllerTest;
import core.util.MD5Util;

/**
 * 
 * create by Liujishuai on 2015骞�9鏈�22鏃�
 * 
 */
public class commonTest extends BaseControllerTest {

	@Test
	public void testMD5() {
		String passwordString = "123456";
		String sk = MD5Util.getMD5(passwordString.getBytes());
		System.out.println(sk);

	}
}
