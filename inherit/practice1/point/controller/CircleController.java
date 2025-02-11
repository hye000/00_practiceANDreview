package inherit.practice1.point.controller;

import inherit.practice1.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();
	// PI => Math.PI 내장 객체 이용
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
//		c = new Circle(x, y, radius); 도 가능
		
		 double area = Math.PI * radius * radius ;
		 return c.toString() + " / 넓이 : " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
//		c = new Circle(x, y, radius); 
		
		double circum = Math.PI * radius * 2;
		return c.toString() + " / 둘레 : " + circum;
	}
}
