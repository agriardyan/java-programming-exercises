package com.mitrais.cdc.java;

public class Square {

	public double width;

	/*
	 * todo: make a Square class with various capabilities below:
	 * 1. Give the Square class a width field of type double
	 * 2. Give Square a method that computes the area (width * width) 
	 * 3. Give Square a constructor to which you can pass the width
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 * 
	 */
	
	public Square(double width) {
		super();
		this.width = width;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.width, 2);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Width: " + this.width + "; Area: " + getArea();
	}
	
}
