/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class SmartPhoneTest {


	public static void main(String[] args) {
		SmartPhone[] SmartPhone = {
				new IPhone("IPhone7", "애플", 900000),
				new Galaxy("갤럭시 s8", "삼성", 800000)
		};
		
		for(SmartPhone s : SmartPhone) {
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFuction();
			s.turnOff();
			System.out.println();
		}

	}

}
