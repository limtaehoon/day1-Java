package day01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1~99���� ������ �Է��ϼ���");
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
	     System.out.println("�ڼ�¦¦");
		}
		else if (cnt==1) {
	      System.out.println("�ڼ�¦");
		}
		else {  
	      System.out.println("�������");
	    }
	  
	
		
		//�������� ���°� ���ŷ��� �ؼ� cnt �� ��ü�ؼ��� cnt=cnt+1�� ���ų�  cnt++�� ���⵵ �Ѵ� �� ��������
		
	           
	
		 
     
     
     
     
     
     
		 
		 
	}
}
