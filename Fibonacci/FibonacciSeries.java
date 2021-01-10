// ################# Without Recursion###################
// class FibonacciSeries {
// 	public static void main(String args[]) {
// 		static int n1=0, n2=1, n3=0, count=10;
// 		System.out.print(n1 + " " + n2);
		
// 		for(int i = 2; i < count; ++i) {
// 			n3 = n1 + n2;
// 			n1 = n2;
// 			n2 = n3;
// 		}
// 	}
// }

// ################# With Recursion #########################
// class FibonacciSeries {
// 	static int n1 = 0, n2 = 1, n3 = 0;
// 	static void fib(int count) {
// 		if (count > 0) {
// 			n3 = n1 + n2;
// 			n1 = n2;
// 			n2 = n3;
// 			System.out.print(" " + n3);
// 			fib(count - 1);
// 		}
// 	}
// 	public static void main(String args[]) {
// 		int count = 10;
// 		System.out.print(n1 + " " + n2);
// 		fib(count - 2);
// 	}
// }

// #################### find specific number ############

// class findNumber {
// 	static void fib(int n) {
// 		if (n <= 1) {
// 			return n;
// 		} else {
// 			return fib(n-1) + fib(n-2);
// 		}
// 	}
// 	public static void main(String args[]) {
// 		int n = 6;
// 		System.out.print(fib(n));
// 	}
// }