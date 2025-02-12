package polymorphism.practice.chap01_poly.view;

import java.util.Scanner;

import polymorphism.practice.chap01_poly.controller.LibraryController;
import polymorphism.practice.chap01_poly.model.vo.Book;
import polymorphism.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);

		while (true) {

			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:

			}
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.print(i + "번 도서 : ");
			System.out.println(bList[i]);
		}

	}

	public void searchBook() {	//TODO

		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] sList = lc.searchBook(keyword);
		for(int i=0; i < sList.length; i++) {
			if(sList[i] != null) {
				System.out.println(sList[i]);							
			}
		}
	}

	public void rentBook() {

		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		default:
			return;
		}
	}
}
