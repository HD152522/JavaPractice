/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember[] members = {
				new FamilyMember("엄마"),
				new FamilyMember("아빠"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		int[] amounts = { 10000, 5000, 2000, 1000 };
		
		FamilyMember.printMemeberCnt();
		
		for(int i=0 ; i<4 ; i++){
			PiggyBank.putMoney(members[i], amounts[i]);
		}
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(members[2], 1000);
		
		PiggyBank.printBalance();

	}

}
