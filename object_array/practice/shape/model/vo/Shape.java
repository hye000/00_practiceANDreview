package object_array.practice.shape.model.vo;

public class Shape {

	//필드
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	//생성자
	public Shape() {}

	public Shape(int type, double height, double width, String color) {
		this.type = type;
		this.height = height;
		this.width = width;
		this.color = color;
	}

	//getter,setter
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String information() {
		return height + " " + width + " " + color; 
	}
	
	
}
