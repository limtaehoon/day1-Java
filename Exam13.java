package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 * ù°�� �Է�
		 * ��°�� �Է�
		 * ��°�� �Է�
		 * ���� �Է�
		 * ex) 10.20 �������30
		 * ex)10,30 ������� 200
		 * +,-,/,* 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù°�� �Է�>>");
		int a=sc.nextInt();
		System.out.println("��°�� �Է�");
		int b=sc.nextInt();
		System.out.println("������ �Է�");
		String op = sc.next();
	     
		
		
		/*switch (op) {
		case "+":System.out.println("�������:" +(a+b));break;
		case "-":System.out.println("�������:" +(a-b));break;
		case "*":System.out.println("�������:"+(a*b));break;
		case "%":System.out.println("���������:"+(a%b));
	    
	    System.out.println("������ ����");
	
	}*/
        if (op.equals("+")) {//���ڿ� ���� ����.equals()���
        System.out.println("�������:" +(a+b));
        }
        else if(op.equals("-")) {
        System.out.println("�������:" +(a-b));
        }
        else if(op.equals("*")) {
        System.out.println("�������:"+(a*b));
        }
        else if(op.equals("%")) {
        System.out.println("���������:"+(a%b));
        }
        System.out.println("������ ����");


	}
}
