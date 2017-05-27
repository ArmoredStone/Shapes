package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesMain {
	
	public static void main(String [] args){
		
		ShapesCollection shapesCollection = new ShapesCollection();
		shapesCollection.createList();
		ArrayList<Shape> shapes = shapesCollection.getShapes(new Circle(), shapesCollection.shapes);
		System.out.println(Arrays.toString(shapes.toArray()));
		
	}
}
