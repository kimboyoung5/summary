package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.(계산기) 5개중에 1개를 받아서 
		// 타자연습
		
		Scanner sc = new Scanner(System.in); //입력받기위한 클래스 
		
		System.out.println("숫자1>");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자2>");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자>");
		String operator = sc.nextLine();
		
	
		int calculator = operator.equals("+") ? num1 + num2 : (operator.equals("-") ? num1 - num2 : (operator.equals("*") ? num1 * num2 : (operator.equals("/") ? num1 / num2 : num1 % num2)));
		
		//연산자비교가 오류 
		
		System.out.println(calculator);
		
		
		
				
		

	}

}
