package com.bridgelabz.basicpgms;

import java.util.Scanner;

public class harmonicN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        if(n>0){
            int i=1;
            while(i<=n){
                sum=sum+(double)1/i;
                i++;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Enter a positive integer.");
        }
    }
}