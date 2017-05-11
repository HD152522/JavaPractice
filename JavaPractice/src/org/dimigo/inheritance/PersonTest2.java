/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("타나카"),
				new Chinese("왕밍")
		};
		
		for(Person person : p) {
			greeting(person);
			System.out.println();
		}

	}
	
	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
	}

}
