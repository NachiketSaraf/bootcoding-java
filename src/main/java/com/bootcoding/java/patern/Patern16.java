package com.bootcoding.java.patern;

public class Patern16 {
    public static void main(String[] args) {
        printTriangle(5);
    }public static  void printTriangle(int n) {
        for (int i =0 ; i<n;i++){
            char ch = (char) ('A'+i);
            for (int j = 0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
