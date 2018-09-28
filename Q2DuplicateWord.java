package com.company;
import java.lang.String;

public class Q2DuplicateWord {
    public static void main(String[] args) {
        String str="java java java is is";
        String str1[]=str.split(" ");
        int count=1;
        for (int i=0; i<str1.length; i++){

            for(int j=i+1; j<str1.length; j++){
                if (str1[i].equals(str1[j])) {
                     count++;
                    str1[j]="0";
                }
            }
            if(str1[i]!="0")
            System.out.println(str1[i]+"="+count);
            count=1;
        }
    }
}
