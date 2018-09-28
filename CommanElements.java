package com.company;

public class CommanElements {
    public static void main(String[] args) {
        int[] e1={1,2,3,4,5};
        int[] e2={1,6,7,3,4};
        System.out.print("Duplicates elements are: ");
        for(int i=0; i<e1.length; i++)
            for(int j = 0; j< e2.length; j++)
                if (e1[i] == e2[j]) {
                    System.out.print(e1[i] +"\t");
                }
    }
}
