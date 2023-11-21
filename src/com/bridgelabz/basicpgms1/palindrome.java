package com.bridgelabz.basicpgms1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int temp = number;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == number;

    }
}
