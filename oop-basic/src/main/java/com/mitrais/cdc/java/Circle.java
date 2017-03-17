package com.mitrais.cdc.java;

public class Circle {

	/*s
	 * todo: make a Circle class with various capabilities below:
	 * 1. Give the Circle class a radius field of type double
	 * 2. Give Circle a method that computes the area ((Math.PI)*radius*radius) 
	 * 3. Give Circle a constructor to which you can pass the radius
	 * 4. Have the constructor use the "this" variable
	 * 5. Add a toString method
	 */
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI)*Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}