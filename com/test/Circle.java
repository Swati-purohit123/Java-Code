package com.test;

public class Circle extends Shape {
	public double getArea()
	{
		return Math.PI*getRadius()*getRadius();
	}
}
