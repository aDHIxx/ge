package com.bridgelabz.algorithm.searching;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key= sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String inVal : inpVals) {
            arr[i++] = Integer.parseInt(inVal);
        }
        System.out.println(lsearch(n,arr,key));
    }

    private static int lsearch(int n, int[] arr,int key) {
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
}
