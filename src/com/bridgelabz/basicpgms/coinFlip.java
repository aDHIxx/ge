package com.bridgelabz.basicpgms;

import java.util.Scanner;
public class coinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flips= sc.nextInt();
        int heads=0;
        int tails=0;
        int i=0;
        if (flips>0){
            while(i<flips){
                double coinRand = Math.random();
                if (coinRand<0.5){
                    heads++;
                }
                else{
                    tails++;
                }
                i++;
            }
            System.out.println("Heads: "+(double)heads/flips*100+"%");
            System.out.println("Tails: "+(double)tails/flips*100+"%");
        }
        else{
            System.out.println("Enter a positive integer.");
        }


    }
}
