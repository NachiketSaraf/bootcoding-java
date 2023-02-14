package com.bootcoding.java.patern;

public class Patern15 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        for (int i =n ; i>0;i--){
            for (char ch ='A';ch <=('A'+i-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
