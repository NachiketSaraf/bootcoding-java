package com.bootcoding.java.comandLineArgument;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
    public static void main(String[] args) {
        if (args[0].equals("-f")){
            printFrequncyAndDuplicate(args);
        }
        else printDuplicate(args);
    }
    public static void printDuplicate(String[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i< arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            if(map.containsKey(n)){
                int value = map.get(n);
                map.put(n,value+1);
            }
            else {
                map.put(n,1);
            }
        }
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value>=2){
                System.out.println(key);
            }
        }
    }
    public static void printFrequncyAndDuplicate(String[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 1;i< arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            if(map.containsKey(n)){
                int value = map.get(n);
                map.put(n,value+1);
            }
            else {
                map.put(n,1);
            }
        }
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value>=2){
                System.out.println(key+" -> "+value);
            }
        }
    }
}
