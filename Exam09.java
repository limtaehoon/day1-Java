package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//�μ��� �Է��Ͽ� 
		//ū��:
		//������:
		//�μ��� �� :
		Scanner sc= new Scanner(System.in);
     /*System.out.println("����1�Է�>>");
	 int num1 = sc.nextInt();
	 System.out.println("����2 �Է�>>");
	 int num2 = sc.nextInt();
	 
	if(num1>num2) {
		System.out.println("ū��:"+num1);
		System.out.println("������:"+num2);
		System.out.println("�μ���:"+(num1-num2));
		
	}
	else if(num1<num2) {
		System.out.println("ū��:"+num2);
		System.out.println("������:"+num1);
		System.out.println("�μ���:"+(num2-num1));
	}
	else if(num1>num2) {
		System.out.println("�μ� ����");
	 */
		 System.out.println("����1�Է�>>");
		 int max = sc.nextInt();
		 System.out.println("����2 �Է�>>");
		 int min = sc.nextInt();
		 if(min > max) {
		 int tmp = max; //int tmp=min
		 max = min;      //min =max
	     min = tmp;      //max=tmp
		 }
		    System.out.println("ū��:"+max);
			System.out.println("������:"+min);
			System.out.println("�μ���:"+(max-min));
	     
		 //ū�� �������� ������ ���ϰ� ���� ���⶧���� �ٸ����� �ϳ��� �ű�� �� 
			
			
	 }
	 
	 
	 }
			

	


