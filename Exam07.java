package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력하세요>>");
	int su =sc.nextInt();
	System.out.println("커트라인을 입력하세요>>");
	int cut= sc.nextInt();
    if(su>=cut);{
	System.out.println("합격");
    }if(su<=cut); {
    System.out.println("불합격");
	}
    if(su%3==0) {
    	System.out.println(su +":3 배수");
    }else {
    	System.out.println(su +":3 배수 아님");   	
    }
    }
	
	}

