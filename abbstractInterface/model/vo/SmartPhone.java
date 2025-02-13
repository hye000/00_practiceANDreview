package academy.abbstractInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{

	/*
	 * 상속 적용 SmartPhone의 멤버 정보
	 * touch();    -TouchDisplay
	 * 
	 * charge();	-CellPhone
	 * makeCall();
	 * takeCall();
	 * picture();
	 * NUMBERPAD
	 */
	
	private String maker;
	
	public SmartPhone() {}
	
	public SmartPhone(String maker) {
		this.maker = maker;
	}
	
	public String picture() {
		return null;
	}
	
	public abstract String printInformation();

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return this.maker;
	}
}
