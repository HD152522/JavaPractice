/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2017. 3. 16.
 * </pre>
 * 
 * @author : ��й�ȣ �ƴ� ���
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ap = 100;
		String[] character = {"������", "����", "���", "���"};
		int choice;
		int setCharacter;
		
		do{
			System.out.println("<<���� �޴�>>");
			System.out.println("1. ���ݷ� ����");
			System.out.println("2. ���ݷ� ����");
			System.out.println("3. ĳ���� ����");
			System.out.println("9. ����");
			System.out.println("----------");
			System.out.println("�޴� �Է� -> "); choice = scanner.nextInt();
			
			
			switch(choice){
			case 1:
				ap+=10;
				System.out.printf("���ݷ��� �����Ǿ����ϴ�. ���� ���ݷ� %d\n", ap);
				break;
			case 2:
				ap-=10;
				System.out.printf("���ݷ��� ���ҵǾ����ϴ�. ���� ���ݷ� %d\n", ap);
				break;
			case 3:
				setCharacter = new Random().nextInt(4);
				System.out.printf("%s(��)�� �����Ǿ����ϴ�. \n", character[setCharacter]);
				break;
			case 9:
				System.out.println("���� �����ϼ���!");
			}
		} while(choice!=9);

	}

	/**
	 * @return
	 */
	private static Object Scanner() {
		// TODO Auto-generated method stub
		return null;
	}

}
