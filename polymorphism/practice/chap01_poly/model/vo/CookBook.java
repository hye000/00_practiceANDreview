package polymorphism.practice.chap01_poly.model.vo;

public class CookBook extends Book{

	private boolean coupon;
	
	public CookBook() {}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	//boolean 타입의 getter 메소드는 is필드명으로 작성
	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook " + super.toString() + " coupon=" + coupon + "]";
	}
	
	
}
