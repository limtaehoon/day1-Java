package day01;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�ڹ� 2.������ ���̽� 3.�ȵ���̵� 4.��Ÿ���� 5.�����սô�");
		System.out.println("�������� ����>>");
		int num =sc.nextInt();
		if(num==1) {
			System.out.println("�ڹٰ���");
		}
		if(num==2) {
		    System.out.println("������ ���̽� ����");
		}
		if(num==3) {
			System.out.println("�ȵ���̵� ����");
			
	    }
		if(num==4) {
			System.out.println("��Ÿ ����");
	    }
		if(num==5) {
			System.out.println("�����մϴ�");
	    }
	    
	    switch(num) {
	    case 1 :System.out.println("�ڹٰ���");break;
	    case 2 :System.out.println("������ ���̽� ����");break;
	    case 3 :System.out.println("�ȵ���̵� ����");break;
	    case 4 :System.out.println("��ٰ���");break;
	    case 5 :System.out.println("�����սô�");
	    }	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	
