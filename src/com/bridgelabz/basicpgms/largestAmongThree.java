package com.bridgelabz.basicpgms;
import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
