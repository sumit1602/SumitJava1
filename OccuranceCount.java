package com.company;

import java.util.Scanner;

public class OccuranceCount {

    public static void main(String[] args) {
        StringBuilder strbl = new StringBuilder("this is string this is builder");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SubString to find in String");
        String toFind = sc.next(".");
        int count = findOccurance(strbl, toFind, 0);
        System.out.println(count);
    }

    private static int findOccurance(StringBuilder strbl, String toFind, int count) {
        if (strbl.charAt(0) == toFind.charAt(0)) {
            count++;
        }
        strbl.deleteCharAt(0);
        if (strbl.length() > 0) {
            count = findOccurance(strbl, toFind, count);
        }
        return count;
    }
}


