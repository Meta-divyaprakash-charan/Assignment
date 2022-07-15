package com.graphics;

import java.util.List;

/**
 * @author Divyaprakash
 *
 */
public class Triangle implements Shape {
	 ShapeType type = ShapeType.TRIANGLE;
	double height = 0.0;
	double base = 0.0;
	double distance = 0.0;
	int x;
	int y;
	Point p;

	public Triangle(Point p, List<Integer> list) {
		this.p = p;
		base = list.get(0);
		height = list.get(1);
	}

	@Override
	public double getArea() {

		double area = 0.5 * (base * height);
		return area;
	}

	@Override
	public double getPerimeter() {
		double halfBase = base / 2;
		double hypotenuse = Math.sqrt((height * height) + (halfBase * halfBase));
		double parameter = 2 * hypotenuse + base;
		return parameter;
	}

	@Override
	public double getOriginDistance() {
		distance = Math.sqrt(x * x + y * y);
		return distance;
	}

	@Override
	public boolean isEnclosed(Point p) {

		return false;
	}

	@Override
	public ShapeType getType() {
		// TODO Auto-generated method stub
		return type;
	}
}