package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class RectTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(isRectangle(rectangle));
		
		Square square = new Square(10);
		//System.out.println(isRectangle(square));
		
	}

	private static boolean isRectangle(Rectangle rectangle) {
		int beforeHeight = rectangle.getHeight();
		rectangle.setWidth(80);
		int afterHeight = rectangle.getHeight();
		if (beforeHeight == afterHeight) {
			return true;
		}
		return false;
	}

}
