package object_array.practice.shape.controller;

import object_array.practice.shape.model.vo.Shape;

public class SquareController {

	//필드
	private Shape s = new Shape();
	
	//메소드
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double perimeter = (width + height)*2;
		return perimeter;
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double area = height * width;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.information();
	}
}
