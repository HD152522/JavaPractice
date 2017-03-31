/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class Question {
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"하현우", "멧 데이먼", "수학"};
		String answerTemp;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0 ; i<3 ; i++){
			System.out.println(i+1+". "+questions[i]);
			answerTemp = scanner.nextLine();
			System.out.println(answers[i].equals(answerTemp) ? "정답입니다!" : "틀렸습니다!");
		}
		
		System.out.println("<<결과 출력>>");
		for(int i=0 ; i<3 ; i++) System.out.println(new StringBuilder().append(questions[i]).append(" ").append(answers[i]));
	}

}
