package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        int len = original.length();

        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}