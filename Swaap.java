package com.company;

public class Swaap {
    public static void main(String[] args) {
        int a=10,b=20;
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println(a +" "+ b);
    }

}
