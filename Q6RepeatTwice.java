package com.company;

import java.util.HashMap;
import java.util.Map;

public class Q6RepeatTwice {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(!m.containsKey(arr[i])){
                m.put(arr[i],0);
            }
            if(m.containsKey(arr[i])){
                m.put(arr[i], m.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
