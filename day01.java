package day01;

public class day01 {

	public static void main(String[] args) {
		int a =49;
		//a�� 50���� ũ��
		if(a>50) { //true
			System.out.println("50���� ũ��");
		}else { //false
              System.out.println("50���� �۴�");
       }
		if(a%2 == 0) {
			System.out.println(a+":¦��");
		}else {
			System.out.println(a+"Ȧ��");
		
		
		}
	//���� if
	 /*
	  * 0�̸�
	  * 0����99���� ��
	  * 100���� 199���� ��
	  * 209���� 299 ���� ��
	  * 300�̻�
	  */
		int b = 252;
		  if(b<0) {
			  System.out.println("0�̸�");
		  }else if(b<100) {
			  System.out.println("0���� 99���� ��");
		  }else if(b<200) {
			  System.out.println("100���� 199���� ��");
		  }else if(b<300) {
			  System.out.println("209���� 299 ���� ��");
		  }else if(b>300) {
			  System.out.println("300 �̻� ��");
		  }
	    int c =353;
	    if(c<0) {
	    	System.out.println("0�̸�");
	    }
	    if(c>=0 && c<100) {//c�� 0���� ũ�� 100���� �۴� �� ���� ���ߵ� (else���� ������ )
	    	System.out.println("0���� 99���� ��");
	    } if(c>=100 && c>200) {
	    	System.out.println("100���� 199���� ��");
 	    } if(c>200 && c<300) {
 	    	System.out.println("200���� 299���� ��");
 	    } if(c>300) {
 	    	System.out.println("300�̻� ��");
 	    }
	   /*
	    * su(51) �� 0���� ũ�� ¦��
	    * su(51) �� 0�̴� 
	    * su(51) �� 0���� ũ�� Ȥ��
	    */
	  
	   
 	    int su =51;
       if(su>0 && su%2==0) {
    	   System.out.println("0���� ũ�� ¦��");
       }if(su==0) {
    	   System.out.println("0�̴�");
    	  
       }if(su<0 && su%2==1) {
    	   System.out.println("0���� �۰� Ȧ��");
       }
       
 	    }
       
	
	}
	

	
	


