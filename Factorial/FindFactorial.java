package Factorial;

public class FindFactorial {
    static int i, fact = 1, num = 8;

    public static void main(String[] args) {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}