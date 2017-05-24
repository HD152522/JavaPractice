/**
 * 
 */
package org.dimigo.ingerfaces;

/**
 * <pre>
 * org.dimigo.ingerfaces
 *   |_DBTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		
		System.out.println("<<변경 전>>");
		crud(IDBManeger.getDBObject("sybase"));
		
		System.out.println();
		
		System.out.println("<<변경 후>>");
		crud(IDBManeger.getDBObject("oracle"));
	}

	public static void crud(IDBManeger db) {
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
