/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2017. 3. 14.
 * </pre>
 * 
 * @author : ��й�ȣ �ƴ� ���
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salery = 1700000;
		int employee = 3;
		int numOfstore = 1500;
		long yearsalery = (long)salery*12*employee*numOfstore;
		
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		System.out.printf("�� ��� �޿� : %s\n", String.format("%,d", salery));
		System.out.printf("���� �� ���� �� : %s\n", String.format("%,d", employee));
		System.out.printf("���� �� : %s\n\n", String.format("%,d", numOfstore));
		System.out.printf("���� �ΰǺ� : %s\n", String.format("%,d", yearsalery));

	}

}
