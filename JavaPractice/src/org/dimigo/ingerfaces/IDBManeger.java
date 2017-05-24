/**
 * 
 */
package org.dimigo.ingerfaces;

/**
 * <pre>
 * org.dimigo.ingerfaces
 *   |_IDBManeger
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public interface IDBManeger {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManeger getDBObject(String database) {
		if(ORACLE_DATABASE.equalsIgnoreCase(database)){
			return new OracleDB();
		}
		
		else if(SYBASE_DATABASE.equalsIgnoreCase(database)){
			return new SybaseDB();
		}
		
		else if(database == null) return null;
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
