package com.graphics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Screen {

	List<Shape> shapes = new ArrayList<Shape>();

	/*
	 * this method will add shape object to the list
	 * 
	 * @param shape object
	 */
	public boolean addShape(Shape shape) {
		shapes.add(shape);

		return true;
	}

	/*
	 * this method will delete the shape object from the list
	 * 
	 * @param shape object
	 */
	boolean deleteShape(Shape shape) {
		shapes.remove(shape);
		return true;
	}

	/*
	 * this method will delete all shape object from the list
	 */
	boolean deleteAllShape() {
		shapes.removeAll(shapes);
		return true;
	}

	/*
	 * this method will show the class@hashcode of all the shapes
	 */
	void showAllShape() {
		for (Shape shape : shapes) {
			shape.toString();
		}
	}

	/*
	 * this method will sort the list in ascending order on the basis of area
	 */
	public List<Shape> sortByArea() {
		List<Shape> sortedListByArea = new ArrayList<Shape>(shapes);
		Collections.sort(sortedListByArea, sortArea);
		return sortedListByArea;
	}

	/*
	 * this will sort the list in ascending order on basis of perimeter
	 */
	public List<Shape> sortByParimeter() {
		List<Shape> sortedListByParimeter = new ArrayList<Shape>(shapes);
		Collections.sort(sortedListByParimeter, sortPerimeter);
		return sortedListByParimeter;
	}

	/*
	 * this will sort the list in ascending order on basis of perimeter
	 */
	public List<Shape> sortByOriginDistance() {
		List<Shape> sortedListByOriginDistance = new ArrayList<Shape>(shapes);
		Collections.sort(sortedListByOriginDistance, sortOriginDistance);
		return sortedListByOriginDistance;
	}

	/*
	 * this will sort the objects of shape in ascending order on basis of area
	 */
	public static Comparator<Shape> sortArea = new Comparator<Shape>() {
		@Override
		public int compare(Shape s1, Shape s2) {
			if (s1.getArea() > s2.getArea())
				return 1;
			else if (s2.getArea() > s1.getArea())
				return -1;
			else
				return 0;
		}
	};

	/*
	 * this will sort the objects of shape type in ascending order on the basis of
	 * perimeter
	 */
	public static Comparator<Shape> sortPerimeter = new Comparator<Shape>() {
		@Override
		public int compare(Shape s1, Shape s2) {
			if (s1.getPerimeter() > s2.getPerimeter())
				return 1;
			else if (s2.getPerimeter() > s1.getPerimeter())
				return -1;
			else
				return 0;
		}
	};

	/*
	 * this will sort the objects of shape type is ascending order on basis of
	 * Origin Distance
	 */
	public static Comparator<Shape> sortOriginDistance = new Comparator<Shape>() {
		@Override
		public int compare(Shape s1, Shape s2) {
			if (s1.getOriginDistance() > s2.getOriginDistance())
				return 1;
			else if (s2.getOriginDistance() > s1.getOriginDistance())
				return -1;
			else
				return 0;
		}
	};
}