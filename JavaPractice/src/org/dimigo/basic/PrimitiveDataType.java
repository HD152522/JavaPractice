package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "������";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight=44.3f;
		char bloodType='A';
		
		System.out.println("<<������ ������>>");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("����: %s\n", isMale==true ? "����" : "����");
		System.out.printf("����: %d\n", age);
		System.out.printf("Ű : %f\n", height);
		System.out.printf("������ : %f\n", height);
		System.out.printf("����: %d\n", age);
		System.out.printf("������ : %c\n", bloodType);

	}

}
