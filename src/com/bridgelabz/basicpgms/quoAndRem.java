package com.bridgelabz.basicpgms;
import java.util.Scanner;

public class quoAndRem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b!=0){
            System.out.println("Quotient: "+a/b);
            System.out.println("Remainder: "+a%b);
        }
    }
}