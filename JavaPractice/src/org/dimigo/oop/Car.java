/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   └ Car
 *
 * 1. 개요 : 자동차 출력1
 * 2. 작성일 : 2017. 3. 21.
 * </pre>
 * 
 * @author : Minseo-Laptop
 * @version : 1.0
 */

public class Car {

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000; 

	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public String getCompany() {
		return company;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	public String getModel() {
		return model;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	public String getColor() {
		return color;
	}
	
	public void setmaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}
	public int getmaxSpeed() {
		return maxSpeed;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public int getPrice() {
		return price;
	}

}