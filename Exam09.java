package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//두수를 입력하여 
		//큰수:
		//작은수:
		//두수의 차 :
		Scanner sc= new Scanner(System.in);
     /*System.out.println("숫자1입력>>");
	 int num1 = sc.nextInt();
	 System.out.println("숫자2 입력>>");
	 int num2 = sc.nextInt();
	 
	if(num1>num2) {
		System.out.println("큰수:"+num1);
		System.out.println("작은수:"+num2);
		System.out.println("두수차:"+(num1-num2));
		
	}
	else if(num1<num2) {
		System.out.println("큰수:"+num2);
		System.out.println("작은수:"+num1);
		System.out.println("두수차:"+(num2-num1));
	}
	else if(num1>num2) {
		System.out.println("두수 같다");
	 */
		 System.out.println("숫자1입력>>");
		 int max = sc.nextInt();
		 System.out.println("숫자2 입력>>");
		 int min = sc.nextInt();
		 if(min > max) {
		 int tmp = max; //int tmp=min
		 max = min;      //min =max
	     min = tmp;      //max=tmp
		 }
		    System.out.println("큰수:"+max);
			System.out.println("작은수:"+min);
			System.out.println("두수차:"+(max-min));
	     
		 //큰수 작은수에 구별를 못하고 덮어 쓰기때문에 다른곳에 하나를 옮기고 씀 
			
			
	 }
	 
	 
	 }
			

	


