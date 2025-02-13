package academy.abbstractInterface.run;

import academy.abbstractInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		String[] result = pc.method();
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
			System.out.println();
		}

//		String[] result = new PhoneController().method();
//		
//		for(String r : result) {
//			System.out.println(r);
//			System.out.println();
//		}
	}
}
