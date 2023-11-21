package com.bridgelabz.algorithm.sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String inVal : inpVals) {
            arr[i++] = Integer.parseInt(inVal);
        }
        arr=bubble(n,arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int[] bubble(int n,int[] arr) {
        for(int i=0;i<n-1;i++){
            Boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!swapped){
                break;
            }

        }
        return arr;
    }
}
