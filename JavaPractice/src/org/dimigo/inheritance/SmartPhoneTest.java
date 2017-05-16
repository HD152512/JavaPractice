/**
 * 
 */
package org.dimigo.inheritance;

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
		
		SmartPhone A = new IPhone("IPhone 7", "애플", 900000);
		System.out.println(A.toString());
		A.turnOn();
		A.pay();
		A.useSpecialFunction(A);
		A.turnOff();
		
		SmartPhone B = new Galaxy("갤럭시 S8", "삼성", 800000);
		System.out.println(B.toString());
		B.turnOn();
		B.pay();
		B.useSpecialFunction(B);
		B.turnOff();
	}

}
