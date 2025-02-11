package inherit.practice1.point.controller;

import inherit.practice1.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
//		r = new Rectangle(x, y, width, height);
		int area = width * height;
		
		return r.toString() + " / 넓이 : " + area;
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
//		r = new Rectangle(x, y, width, height);
		int perimeter = (width + height) * 2;
		
		return r.toString() + " / 둘레 : " + perimeter;
	}
}
