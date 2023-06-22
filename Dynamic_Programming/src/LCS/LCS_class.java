package LCS;

public class LCS_class {

//	LCS= Longest common subsequence 
//	2^m
//	|
//	adgei= a ag ae ge agi aei-----ANSWER=>3
//	abegi= a ag ae ge agi aei---|^
//	|
//	2^n
//	          TC= 2^n * 2^m => 2^m+n
//   
//	

	public static int lcs(String s, String t) {

		if (s.length() == 0 || t.length() == 0) {
			return 0;
		}

		if (s.charAt(0) == t.charAt(0)) {
			return 1 + lcs(s.substring(1), t.substring(1));
		} else {
			int op1 = lcs(s, t.substring(1));
			int op2 = lcs(s.substring(1), t);
//			int op3 = lcs(s.substring(1), t.substring(1));

//			return Math.max(op1, Math.max(op2, op3));
			
			
			return Math.max(op1,op2);
		}

	}

	public static void main(String[] args) {
		
		String s="agihtt";
		String t="bcgoihtt";
		System.out.println("LCS Length is "+lcs(s,t));
		
		

	}

}
