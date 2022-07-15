package com.graphics;

import java.util.List;

public class Rectangle implements Shape {
	ShapeType type = ShapeType.RECTANGLE;

	double length = 0.0;
	double breadth = 0.0;
	double distance = 0.0;
	Point p;
	int x, y;

	public Rectangle(Point p, List<Integer> list) {
		this.p = p;
		this.length = list.get(0);
		this.breadth = list.get(1);
	}

	@Override
	public double getArea() {

		double area = length * breadth;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}

	@Override
	public double getOriginDistance() {
		distance = Math.sqrt(x * x + y * y);
		return distance;
	}

	@Override
	public boolean isEnclosed(Point p) {

		double xMax = x + length;
		double yMax = y + breadth;

		if (p.x <= xMax && p.y <= yMax)
			return true;
		return false;
	}

	@Override
	public ShapeType getType() {
		return type;
	}
}