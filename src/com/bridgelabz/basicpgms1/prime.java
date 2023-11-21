package com.bridgelabz.basicpgms1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        boolean flag = false;
        int i=2;
        while (i <= n / 2) {
            if (n % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }
        return !flag;
    }

    }

