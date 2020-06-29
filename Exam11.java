package day01;

public class Exam11 {

	public static void main(String[] args) {
         int n1= 5;
         int n2= ++n1;
         System.out.println("n1:"+n1);
         System.out.println("n2:"+n2);
         System.out.println("=========");
         int n3 =n1++;
         System.out.println("n1:"+n1);
	     System.out.println("n3:"+n3);


//후위연산 할일이 있으면 먼저 연산되거 없으면 나중에 연산됨
         int  m1 =7;
         int  m2 =--m1;
         int  m3 = m1--;
         System.out.println("m1:"+m1);//7
         System.out.println("m2:"+m2);//6
         System.out.println("m3:"+m3);//6
       
     int a=50, b=3;
     int c;
     a++;//51
     ++b;//4
     c=a++ + ++b;//a=51,b=5,c=56 -->a=52
     System.out.println("a:"+a);//52
     System.out.println("b:"+b);//5
     System.out.println("c:"+c);//56
         
     int aa=10, bb=3;
     int cc;
     --aa;//9
     bb++;//5
     cc=aa-- + ++bb;//7
     System.out.println("aa:"+aa);//8
     System.out.println("bb:"+bb);//5
     System.out.println("cc:"+cc);//14
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

   }
         
      

