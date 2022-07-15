package com.graphics;

import java.util.List;

public class Factory {
	public static Shape createShape(ShapeType str, Point p, List<Integer> list) {
		Shape shape;
		switch (str) {
		case CIRCLE:
			shape = new Circle(p, list);
			break;
		case RECTANGLE:
			shape = new Rectangle(p, list);
			break;
		case SQUARE:
			shape = new Square(p, list);
			break;
		case TRIANGLE:
			shape = new Triangle(p, list);
			break;
		default:
			return null;
		}
		return shape;

	}
}