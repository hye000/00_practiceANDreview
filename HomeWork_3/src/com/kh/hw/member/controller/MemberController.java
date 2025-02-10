package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	// 메소드
	public int existMemberNum() {
		// 배열의 요소 중 null값이 아닌 요소의 개수를 구해서 return
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
			} else {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		boolean result = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (inputId.equals(m[i].getId())) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// 객체 배열의 요소의 값이 null인 위치에 객체 저장
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}

	public String searchId(String id) {
		String info = null;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (id.equals(m[i].getId())) { // 문자열 비교 equals
					info = m[i].inform();
					break;
				}
			}
		}
		return info;
	}

	// TODO
	public Member[] searchName(String name) {
		// 일치하는 회원의 수를 세기 위한 변수
		int count = 0;
		// 일치하는 회원의 수를 먼저 계산
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && name.equals(m[i].getName())) {
				count++;
			}
		}
		// 일치하는 회원이 없으면 빈 배열을 반환
		if (count == 0) {
			return new Member[0];
		}

		// 일치하는 회원들을 담을 새로운 배열
		Member[] nameList = new Member[count];
		int index = 0;

		// 다시 배열을 순회하면서 일치하는 회원을 새로운 배열에 저장
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && name.equals(m[i].getName())) {
				nameList[index] = m[i];
				index++;
			}
		}
		return nameList;
	}

	// TODO
	public Member[] searchEmail(String email) {

		int count = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && email.equals(m[i].getName())) {
				count++;
			}
		}

		if (count == 0) {
			return new Member[0];
		}

		Member[] nameList = new Member[count];
		int index = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && email.equals(m[i].getName())) {
				nameList[index] = m[i];
				index++;
			}
		}
		return nameList;
	}

	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (id.equals(m[i].getId())) {
					m[i].setPassword(password);
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public boolean updateName(String id, String name) {
		boolean result = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (id.equals(m[i].getId())) {
					m[i].setName(name);
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				if (id.equals(m[i].getId())) {
					m[i].setEmail(email);
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean delete = false;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				// 객체의 멤버(필드, 메소드)에 접근 시 null 체크 해주기
				// => 체크하지 않을 경우 NullPointerException 발생될 수 있음
				m[i] = null;
				delete = true;
				break;
			}
		}
		return delete;
	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				m[i] = null;
			}
		}
	}

	// 회원 목록을 반환하는 메소드
	// 회원 목록(Member 배열)
	public Member[] printAll() {
		// return m; //=> 회원 정보 출력 시 null체크 해야함
		// 저장된 회원 목록에 대한 배열을 만들어서 반환
		Member[] mList = new Member[m.length];
		int count = 0;

		// 새로운 배열에 null이 아닌 값으로 복사
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {

				for (int j = 0; j < mList.length; j++) {
					if (mList[j] == null) {
						mList[j] = m[i];
						break;
					}
				}
			}
		}

		// 새로운 배열의 null값을 가진 위치 전까지만 반환
		int index = -1;
		for (int i = 0; i < mList.length; i++) {
			if (mList[i] == null) {
				index = i;
				break;
			}
		}
		if (index > -1) {
			Member[] copy = new Member[index];
			System.arraycopy(mList, 0, copy, 0, index);
			mList = copy;
		} else {
			mList = new Member[0];
		}
		return mList;
	}
}
