/**
 * 
 */
package org.dimigo.basic;

/**
 *<pre>
 * org.dimigo.basic
 *   └ Operator
 *
 * 1. 개요 : 디미베네 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *  
 * @author : Minseo-Laptop
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month = 1700000;
		int supply = 3;
		int shop = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+ String.format("%,d",month)+'원');
		System.out.println("점포 내 직원 수 : "+ supply + '명');
		System.out.println("점포 수 : " + String.format("%,d", shop)+'개');
		System.out.println("\n\n"+"연간 인건비 : " + String.format("%,d", (long)month*12*supply*shop)+'원');
		
		

	}

}
