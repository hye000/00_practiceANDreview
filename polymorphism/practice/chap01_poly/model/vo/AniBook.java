package polymorphism.practice.chap01_poly.model.vo;

public class AniBook extends Book{

	private int accessAge;
	
	public AniBook() {}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		// => 부모 클래스 생성자는 항상 첫 줄에 작성(제일 먼저 실행됨)
		this.accessAge = accessAge;
	}
	
	
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook " + super.toString() + " accessAge=" +  accessAge + "]";
	}
}
