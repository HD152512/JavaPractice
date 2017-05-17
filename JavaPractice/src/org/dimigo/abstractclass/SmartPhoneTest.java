/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 * org.dimigo.inheritance
 *   └ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *  
 * @author : Minseo-Laptop
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phones = {
				new IPhone("IPhone7", "애플", 900000), new Galaxy("Galaxy S8", "삼성", 800000)
		};
		
		for(SmartPhone phone : phones) {
		System.out.println(phone);
		phone.turnOn();
		// 자식클래스에서 오버라이딩한 pay()가 실행됨
		phone.pay();
		
		// IPhone 또는 Galaxy에 있는 특별 기능 사용하기
		phone.useSpecialFunction();
		
		phone.turnOff();
		System.out.println();
		}
		

	}

}
