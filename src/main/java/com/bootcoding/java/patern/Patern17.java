package com.bootcoding.java.patern;

import java.awt.*;

public class Patern17 {
    public static void main(String[] args) {
        int c = 0;
        System.in.read();
        printTriangle(5);
    }public static void printTriangle(int n) {
        for (int i = 0 ; i < n  ; i++){
            for (int j = 0 ; j<n-i-1 ; j++){
                System.out.print(" ");
            }//char
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= (2*i+1) ; j++){
                System.out.print(ch);
                if (j<= breakpoint)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }

}
