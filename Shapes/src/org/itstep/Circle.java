package org.itstep;

public class Circle extends Shape {
	int radius;

	public double calculateArea(int radius) {
		return Math.PI * (radius * radius);
	}
}
