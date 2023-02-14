package com.bootcoding.java.patern;

public class Patern7 {
    public static void main(String[] args) {
        printTriangle(5);
    }
   public static void printTriangle(int n) {
        for (int i = 0 ; i < n  ; i++){
            for (int j = 0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j < (2*i+1) ; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
