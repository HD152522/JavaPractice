package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight=44.3f;
		char bloodType='A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별: %s\n", isMale==true ? "남자" : "여자");
		System.out.printf("나이: %d\n", age);
		System.out.printf("키 : %f\n", height);
		System.out.printf("몸무게 : %f\n", height);
		System.out.printf("나이: %d\n", age);
		System.out.printf("혈액형 : %c\n", bloodType);

	}

}
