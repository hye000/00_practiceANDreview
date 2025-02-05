// 152page

package practice_object;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.child = 3;
		
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person.name);
		System.out.println("결혼 여부 : " + person.married);
		System.out.println("자녀 수 : " + person.child);

	}

}
