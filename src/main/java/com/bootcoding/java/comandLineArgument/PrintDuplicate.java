package com.bootcoding.java.comandLineArgument;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {
    public static void main(String[] args) {

        if (args[0].equals("-f")){
            printFrequncyAndDuplicate(args);
        }
        else if (args[0].equals("-min")){
            printNumberWithMinFrequncy(args);
        }else if (args[0].equals("-max")){
            printNumberWithMaxFrequncy(args);
        }
        else printDuplicate(args);
    }

    private static void printNumberWithMaxFrequncy(String[] arr) {
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
        int max=Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (max<value){
                max=value;
            }
        }
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (max==value){
                System.out.println(key+" has minimum frequncy");
            }
        }
    }

    private static void printNumberWithMinFrequncy(String[] arr) {
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
        int min=Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (min>value){
                min=value;
            }
        }
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (min==value){
                System.out.println(key+" has minimum frequncy");
            }
        }
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
