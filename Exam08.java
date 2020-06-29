package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
   
     System.out.println("이름>>");
     String name = sc.next(); //문자는 next
	
    System.out.println("국어,수학,영어점수를 입력하세요>>");
	int score1 = sc.nextInt();
    int score2 = sc.nextInt();
    int score3 = sc.nextInt();
    
    int total =score1+score2+score3;
    int avg = (score1+score2+score3)/3;
	
    
    System.out.println("이름:"+name);
	System.out.println("총점:"+total);
	System.out.println("평균:"+avg);
	
	String grade="";    
    if (avg>90){
    	grade="A학점";
    }
    else if(avg<89 && avg>81){
		grade="B학점";
	}
    else if(avg<80 && avg>71){
		grade="C학점";
	}
    else if(avg<90 && avg>81){
		grade="D학점";
	}
	
	System.out.println(grade);

		


		
	}
}
