package ch06;

public class Exam6_3_4sol {
	
	public static String dilemma(boolean a, boolean b) {
		String result = "";
		
		
		//A �ڹ�, B �ڹ� ����
		if(a == true && b == false) {
			result = "A ����, B 10��";
		}else if(a != true && b == true) {
			result = "A 10��, B ����";
		}else if(a && b) {
			result = "A 5��, B 5��";
		}else if(!a && !b) {
			result = "A 1��, B 1��";
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(dilemma(false,true));
	}
}