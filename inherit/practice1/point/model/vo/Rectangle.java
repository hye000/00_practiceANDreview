package inherit.practice1.point.model.vo;

public class Rectangle extends Point{

	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		// setter 메소드를 사용하여 초기화
		// 1) this.setX(x);
		// 2) super.setX(x); 둘 다 가능
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return super.toString() + ", width : " + width + ", height : " + height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	
	
	
	
}
