package com.bridgelabz.basicpgms;

import java.util.Scanner;

public class powerOfTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        if ((n>=0) && (n<31)){
            int i=0;
            int power=1;
            while(i<=n){
                System.out.println("2 ** "+i+" =  "+power);
                power=power*2;
                i++;
            }

        }

    }
}