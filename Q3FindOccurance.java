package com.company;

import java.util.Scanner;

public class Q3FindOccurance {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("e is 5 times in this sentence");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a character to find in the given string");
        String find=sc.nextLine();
        int count =findOccurance(sb,find,0);
        System.out.println(count);

    }
    static int findOccurance(StringBuilder sb, String find, int count){
        if(sb.charAt(0)==find.charAt(0)){
            count++;
        }
         sb.deleteCharAt(0);
        if(sb.length()>0){
            count = findOccurance(sb,find,count);
        }
      return count;
    }

}
