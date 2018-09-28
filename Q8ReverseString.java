package com.company;

public class Q8ReverseString {
    public static void main(String[] args) {
        StringBuffer strbr = new StringBuffer("987654321");
        strbr.reverse();
        System.out.println(strbr);
        strbr.delete(4,9);
        System.out.println(strbr);
//        String x="Sumit";
//
//        String c=x.replace('u','o');
//        System.out.println(c);
    }
}
