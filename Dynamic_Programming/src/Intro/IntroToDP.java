package Intro;

public class IntroToDP {

	// 1.Optimal Substructure (Recursion)--problem is dependent on smaller
	// subproblems
	// 2.Overlapping Subproblems--storing somewhere the overlapping subproblem
	// results is nothing but called as dynamic programming
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	

	public static int Fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int ans1 = Fibonacci(n - 1);
		int ans2 = Fibonacci(n - 2);

		int myFibo = ans1 + ans2;

		return myFibo;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(Fibonacci(5));

	}

}
