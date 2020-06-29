package day01;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.자바 2.데이터 베이스 3.안드로이드 4.기타공부 5.공부합시다");
		System.out.println("과목정보 선택>>");
		int num =sc.nextInt();
		if(num==1) {
			System.out.println("자바공부");
		}
		if(num==2) {
		    System.out.println("데이터 베이스 공부");
		}
		if(num==3) {
			System.out.println("안드로이드 공부");
			
	    }
		if(num==4) {
			System.out.println("기타 공부");
	    }
		if(num==5) {
			System.out.println("공부합니다");
	    }
	    
	    switch(num) {
	    case 1 :System.out.println("자바공부");break;
	    case 2 :System.out.println("데이터 베이스 공부");break;
	    case 3 :System.out.println("안드로이드 공부");break;
	    case 4 :System.out.println("기다공부");break;
	    case 5 :System.out.println("공부합시다");
	    }	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	
