package com.company;
import java.lang.String;

public class Q10Method0verloading {
    public static void main(String[] args) {
        overloaded ov = new overloaded();
        ov.sum(2, 5);
        ov.sum(2.3, 4.1);
        ov.mul(2.3f, 4.1f);
        ov.mul(2,5);
        String s = ov.sum("sumit", "chaudhary");
        System.out.println(s);
        s = ov.sum("sumit", "chaudhary","ttn");
        System.out.println(s);
    }

    static class overloaded {
        void sum(int a, int b) {
            System.out.println("Adding 2 integer number = "+ (a + b));
        }
        void mul(int a, int b) {
            System.out.println("multiply 2 integer number = "+ (a * b));
        }

        String sum(String a, String b) {
            return ("Adding 2 STring number = "+ (a + b));
        }
        String sum(String a, String b, String c) {
            return ("Adding 3 integer number = "+ (a + b + c));
        }

        void sum(Double a, Double b) {
            System.out.println("Adding 2 Double number = "+ (a + b));
        }
        void mul(Float a, Float b) {
            System.out.println("Adding 2 Float number = "+ (a + b));
        }

    }
}
