package ch04;

//�ΰ��� �ֻ����� �������� ������ ���� (��1, ��2) ���·� ����ϰ�,
//���� ���� 10�̸� ������ �����ϴ� �ڵ� �ۼ� (Math.random() �޼ҵ�)

public class Exam4_5 {
	 public static void main(String[] args) {
		 boolean isContinue = true;
		 int count = 0;

			 while(isContinue) {
			 int num1 = (int) (Math.random() * 6 + 1);
			 int num2 = (int) (Math.random() * 6 + 1);
	
			 // �ڵ� �ۼ�
			 System.out.println("("+num1+","+num2+")");
			 
			 if(num1 + num2 == 10) {
				 isContinue = false;
				 break;
			 }
			 count = count + 1;
			 }
			 
	
			 System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	
			 }
	 
}