/**
 * 
 */
package org.dimigo.ingerfaces;

/**
 * <pre>
 * org.dimigo.ingerfaces
 *   |_OracleDB
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class OracleDB implements IDBManeger {

	@Override
	public void insert() {
		System.out.println("Oracle DB 저장");
		
	}

	@Override
	public void search() {
		System.out.println("Oracle DB 조회");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB 변경");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
