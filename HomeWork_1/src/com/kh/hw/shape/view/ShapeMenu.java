package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	// 필드
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	// 메소드
	public void inputMenu() {
		while (true) {

			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int type = sc.nextInt();

			if (type == 3) {
				triangleMenu();
				break;
			} else if (type == 4) {
				squareMenu();
				break;
			} else if (type == 9) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}

	}

	public void triangleMenu() {
		while (true) {

			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			if (select == 1) {
				inputSize(3, 1);
			} else if (select == 2) {
				inputSize(3, 2);
			} else if (select == 3) {
				printInformation(3);
			} else if (select == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}

	}

	public void squareMenu() {
		while (true) {

			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			if (select == 1) {
				inputSize(4, 1);
			} else if (select == 2) {
				inputSize(4, 2);
			} else if (select == 3) {
				inputSize(4, 3);
			} else if (select == 4) {
				printInformation(4);
			} else if (select == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 3) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double tcArea = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + tcArea);
			} else if (menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}

		if (type == 4) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double sqPeri = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + sqPeri);
			} else if (menuNum == 2) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double sqArea = scr.calcArea(height, width);
				System.out.println("사각형 면적 : " + sqArea);
			} else if (menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}
	}

	public void printInformation(int type) {
		if (type == 3) {
			String tcInfo = tc.print();
			System.out.println(tcInfo);
		} else if (type == 4) {
			String scrInfo = scr.print();
			System.out.println(scrInfo);
		}
	}
}
