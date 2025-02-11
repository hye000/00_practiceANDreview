package inherit.practice1.point.model.vo;

public class Circle extends Point{

	private int radius;

	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public String toString() {
		return super.toString() + ", radius : " + radius;
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
