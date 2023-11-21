package com.bridgelabz.strings.strings_dp;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.length()==str2.length()){
            System.out.println(anagramSort(str1, str2));
        }
        else{
            System.out.println(false);
        }
    }

    private static boolean anagramSort(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;


    }
}
