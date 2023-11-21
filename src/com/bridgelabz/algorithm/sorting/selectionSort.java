package com.bridgelabz.algorithm.sorting;

import java.util.Scanner;

public class selectionSort {
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
        arr=select(n,arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int[] select(int n,int[] arr) {
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
}
