package com.bridgelabz.arrays.arrays_dp;
import java.util.Scanner;
public class sumCheck {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inpVals = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int i = 0;
        for (String inVal : inpVals) {
            arr[i++] = Integer.parseInt(inVal);
        }
        System.out.println(sumEqCheck(n,arr));
    }

    public static boolean sumEqCheck(int n,int[] arr) {         // oer we can just do if(i<n/2) sumFirst+=arr[i]; else sumSecond+=arr[i];
        int sumFirst=0;
        int sumSecond=0;
        for(int i=0;i<n/2;i++){
            sumFirst+=arr[i];
            sumSecond+=arr[i+n/2];
        }
        if (n%2!=0){
            sumSecond+=arr[n-1];
        }
        if(sumFirst==sumSecond){
            return true;
        }
        else{
            return false;
        }
    }
}
