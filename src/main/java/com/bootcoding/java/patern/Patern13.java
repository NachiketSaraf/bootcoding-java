package com.bootcoding.java.patern;

public class Patern13 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static  void printTriangle(int n) {
        for (int i =0 ; i<n;i++){
            for (char ch ='A';ch <=('A'+i);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
