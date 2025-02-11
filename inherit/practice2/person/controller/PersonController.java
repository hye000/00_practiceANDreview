package inherit.practice2.person.controller;

import inherit.practice2.person.model.vo.Employee;
import inherit.practice2.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] count = new int[2];
		int stdCount = 0;
		int empCount = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				stdCount++;
				count[0] = stdCount;
			} else if (e[i] != null) {
				empCount++;
				count[1] = empCount;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	public Student[] printStudent() { // TODO
		Student[] stdList = new Student[s.length];
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				for (int j = 0; j < stdList.length; j++) {
					if (stdList[j] == null) {
						stdList[j] = s[i];
						break;
					}
				}
			}
		}
		return stdList;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() { // TODO

		Employee[] empList = new Employee[e.length];
		for (int i = 0; i < s.length; i++) {
			if (e[i] != null) {
				for (int j = 0; j < empList.length; j++) {
					if (empList[j] == null) {
						empList[j] = e[i];
						break;
					}
				}
			}
		}
		return empList;
	}

}
