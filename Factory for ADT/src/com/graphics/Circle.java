package com.graphics;

import java.util.List;

/**
 * @author Divyaprakash
 *
 */
public class Circle implements Shape {
    ShapeType type = ShapeType.CIRCLE;
	Point point;
	double radius = 0.0;
	final double pi = 3.14;
	double distance;
    
	int x, y;

	public Circle(Point point, List<Integer> list) {
		this.radius = list.get(0);
		this.point = point;
	}

	@Override
	public double getArea() {
		double area = pi * radius * radius;
		return area;
	}

	@Override
	public double getPerimeter() {
		double parameter = 2 * pi * radius;
		return parameter;
	}

	@Override
	public double getOriginDistance() {
		distance = Math.sqrt(x * x + y * y);
		return distance;

	}

	@Override
	public boolean isEnclosed(Point p) {

		distance = Math.sqrt((p.x - x) * (p.x - x) - (p.y - y) * (p.y - y));
		if (distance <= radius)
			return true;
		else
			return false;
	}
   @Override
	public ShapeType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}