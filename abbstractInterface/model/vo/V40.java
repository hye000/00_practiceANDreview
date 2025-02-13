package academy.abbstractInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {

	public V40() {
		super.setMaker("LG");
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public String charge() {
		return super.charge();
	}

	@Override
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}

	@Override
	public String makeCall() {
		return super.makeCall();
	}

	@Override
	public String takeCall() {
		return super.takeCall();
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}

	@Override
	public String printInformation() {
		return "V40은 LG에서 만들어졌고 제원은 다음과 같다." + "\n" 
				+ makeCall() + "\n" 
				+ takeCall() + "\n" 
				+ picture() + "\n" 
				+ charge() + "\n" 
				+ touch() + "\n" 
				+ "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}

}
