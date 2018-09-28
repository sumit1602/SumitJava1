package com.company;

public class Q5Java1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr1[] = {2, 3, 4, 9, 8, 7};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
