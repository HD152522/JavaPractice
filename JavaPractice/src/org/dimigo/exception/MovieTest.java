/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_MovieTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 30.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class MovieTest {
	
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("에일리언:커버넌트", 15),
				new Movie("가디언즈 오브 갤럭시", 12)
				
		};
		
		for(Movie value : movies) {
			try {
				value.buyTicket(12);
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

			
	}
	
	
}
