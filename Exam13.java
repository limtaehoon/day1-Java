package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 * 첫째수 입력
		 * 둘째수 입력
		 * 셋째수 입력
		 * 연산 입럭
		 * ex) 10.20 덧셈결과30
		 * ex)10,30 곱셈결과 200
		 * +,-,/,* 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫째수 입력>>");
		int a=sc.nextInt();
		System.out.println("둘째수 입력");
		int b=sc.nextInt();
		System.out.println("연산자 입력");
		String op = sc.next();
	     
		
		
		/*switch (op) {
		case "+":System.out.println("덧셈결과:" +(a+b));break;
		case "-":System.out.println("뺄셈결과:" +(a-b));break;
		case "*":System.out.println("곱셈결과:"+(a*b));break;
		case "%":System.out.println("나눗셈결과:"+(a%b));
	    
	    System.out.println("연산자 오류");
	
	}*/
        if (op.equals("+")) {//문자열 값이 같다.equals()사용
        System.out.println("덧셈결과:" +(a+b));
        }
        else if(op.equals("-")) {
        System.out.println("뺄셈결과:" +(a-b));
        }
        else if(op.equals("*")) {
        System.out.println("곱셈결과:"+(a*b));
        }
        else if(op.equals("%")) {
        System.out.println("나눗셈결과:"+(a%b));
        }
        System.out.println("연산자 오류");


	}
}
