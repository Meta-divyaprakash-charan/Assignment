package com.graphics;

public interface Shape {
	double getArea();

	double getPerimeter();

	double getOriginDistance();

	boolean isEnclosed(Point p);
	 
	ShapeType getType();
}