package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
   
     System.out.println("�̸�>>");
     String name = sc.next(); //���ڴ� next
	
    System.out.println("����,����,���������� �Է��ϼ���>>");
	int score1 = sc.nextInt();
    int score2 = sc.nextInt();
    int score3 = sc.nextInt();
    
    int total =score1+score2+score3;
    int avg = (score1+score2+score3)/3;
	
    
    System.out.println("�̸�:"+name);
	System.out.println("����:"+total);
	System.out.println("���:"+avg);
	
	String grade="";    
    if (avg>90){
    	grade="A����";
    }
    else if(avg<89 && avg>81){
		grade="B����";
	}
    else if(avg<80 && avg>71){
		grade="C����";
	}
    else if(avg<90 && avg>81){
		grade="D����";
	}
	
	System.out.println(grade);

		


		
	}
}
