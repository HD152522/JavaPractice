package org.dimigo.oop;
/**
 * 
 */

/**
 * <pre>
 * 
 *   |_FamilyMember
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName){
		FamilyMember.memberCnt++;
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public static void printMemeberCnt() {
		System.out.println("가족 총 인원 수 : " + FamilyMember.memberCnt);
	}
	
}
