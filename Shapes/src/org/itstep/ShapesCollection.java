package org.itstep;

import java.util.ArrayList;

public class ShapesCollection {
	ArrayList<Shape> shapes = new ArrayList<>();

	public void createList() {
		for (int i = 0; i <= 4; i++) {
			Square square = new Square();
			Regtangle regtangle = new Regtangle();
			Circle circle = new Circle();
			shapes.add(circle);
			shapes.add(square);
			shapes.add(regtangle);
		}

	}

	public ArrayList<Shape> getShapes(Shape shape, ArrayList<Shape> shapes) {
		ArrayList<Shape> shapesX = new ArrayList<>();
		String shapesType = shape.getClass().getName();
		for (Shape shapeX : shapes) {
			if (shapeX.getClass().getName().equals(shapesType)) {
				shapesX.add(shapeX);
				continue;
			} else {
				continue;
			}

		}
		return shapesX;
	}
}
