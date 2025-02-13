package academy.abbstractInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	public GalaxyNote9() {
		super.setMaker("삼성");
		// this.setMaker(); setMaker(); 셋 다 가능
	}
	
	public String makeCall() {
		return super.makeCall();
	}
	
	public String takeCall() {
		return super.takeCall();
	}
	
	public String picture() {
		return "1300만 듀얼카메라";
	}
	
	public String charge() {
		return super.charge();
	}
	
	public String touch() {
		return super.touch() + ", 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return PEN_BUTTON;	//=>true
	}
	
	public String printInformation() {
		return "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다." + "\n"
				+ makeCall() + "\n"
				+ takeCall() + "\n"
				+ picture() + "\n"
				+ charge() + "\n"
				+ touch() + "\n"
				+ "블루투스 펜 탑재 여부 : " + bluetoothPen();
	}
	
}
