package object_array.practice.shape.controller;

import object_array.practice.shape.model.vo.Shape;

public class TriangleController {

	//필드
	private Shape s = new Shape();
	
	//메소드
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double area = (height * width) / 2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형 " + s.information();
	}
}
