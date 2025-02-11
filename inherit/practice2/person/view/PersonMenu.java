package inherit.practice2.person.view;

import java.util.Scanner;

import inherit.practice2.person.controller.PersonController;
import inherit.practice2.person.model.vo.Employee;
import inherit.practice2.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명 입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명 입니다.");

		

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {

		while (true) {

			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			boolean isFull = pc.personCount()[0] == 3 && select == 1;
			if(isFull == true) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
				break;
			}
			
			switch (select) {
			case 1:
				// TODO : 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
				if (pc.personCount()[0] == 3) {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
					break;
				}
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void employeeMenu() {
		while (true) {

			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();

			// 입력 받기 전에 조건식 설정
			boolean isFull = pc.personCount()[1] == 10 && select == 1;
			if(isFull == true) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
				break;
			}
			
			switch (select) {
			case 1:
				// TODO : 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
				if (pc.personCount()[1] == 10) {
					System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
					break;
				}
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		while (true) {

			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] < 3) {
				System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char answer = sc.next().charAt(0);

				if (answer == 'n' || answer == 'N') {
					return;
				}
			} else if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
		}
	}

	public void printStudent() { // TODO

		Student[] stdList = pc.printStudent();
		for(Student s : stdList) {
			if(s!=null) {
				System.out.println(s.toString());
			}
		}
	}

	public void insertEmployee() {
		System.out.print("사원 이름 : ");
		String name = sc.next();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		System.out.print("사원 부서 : ");
		String dept = sc.next();

		pc.insertEmployee(name, age, height, weight, salary, dept);

		if (pc.personCount()[1] < 10) {
			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char answer = sc.next().charAt(0);
			if (answer == 'n' || answer == 'N') {
				return;
			}
		} else if (pc.personCount()[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void printEmployee() { // TODO

		Employee[] empList = pc.printEmployee();
		for(Employee e : empList) {
			if(e!=null) {
				System.out.println(e.toString());
			}
		}
		pc.printEmployee();
	}

}
