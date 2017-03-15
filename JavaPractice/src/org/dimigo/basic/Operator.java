/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
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
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %s\n", String.format("%,d", salery));
		System.out.printf("점포 내 직원 수 : %s\n", String.format("%,d", employee));
		System.out.printf("점포 수 : %s\n\n", String.format("%,d", numOfstore));
		System.out.printf("연간 인건비 : %s\n", String.format("%,d", yearsalery));

	}

}
