package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϼ���>>");
	int su =sc.nextInt();
	System.out.println("ĿƮ������ �Է��ϼ���>>");
	int cut= sc.nextInt();
    if(su>=cut);{
	System.out.println("�հ�");
    }if(su<=cut); {
    System.out.println("���հ�");
	}
    if(su%3==0) {
    	System.out.println(su +":3 ���");
    }else {
    	System.out.println(su +":3 ��� �ƴ�");   	
    }
    }
	
	}

