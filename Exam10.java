package day01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1~99사이 정수를 입력하세요");
		 int num = sc.nextInt();
		 int a= num/10;
		 int b= num%10;
		 
		int cnt=0;
		if (a!=0 && a%3==0){
		  cnt=cnt+1;
		}
		if (b!=0 && b%3==0){
	      cnt = cnt+1;
	    }
		if (cnt==2){
	     System.out.println("박수짝짝");
		}
		else if (cnt==1) {
	      System.out.println("박수짝");
		}
		else {  
	      System.out.println("음답없음");
	    }
	  
	
		
		//같은것을 쓰는걸 번거러워 해서 cnt 로 대체해서씀 cnt=cnt+1로 쓰거나  cnt++로 쓰기도 한다 다 같은말임
		
	           
	
		 
     
     
     
     
     
     
		 
		 
	}
}
