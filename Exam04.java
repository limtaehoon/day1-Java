package day01;

public class Exam04 {

	public static void main(String[] args) {
        //������ r�� 5�� ���ϰ�
		//���� ���̸� ����Ͻÿ� 
		//���ַ��� 3.14
         int r=5;
         System.out.println(r*r*3.14);
         final double PI = 3.14;
         System.out.println(r*r*PI);
         // pi =3.15;
         System.out.println(r*r*PI);
	float f=5.0f;//4����Ʈ
	int num=10;// 4����Ʈ
	f =num; //int < float=int ����ȯ(ĳ����)<-�ڵ�����ȯ
	 System.out.println("f:"+f);
	num=(int)f; //int<-float ����ȯ(ĳ����)<-����� ��ȯ}
	long lo =100L;
	//f= num1; // float = long
	double area = r*r*PI;
	System.out.println("������:"+area);
	
	}
}