package com.bootcoding.java.patern;

public class Patern12 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        int space = 3*n;
        for (int i =1 ; i<=n ; i++){
            //numbers
            for (int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            //space
            for (int j=0;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for (int j = i; j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space -=4;
        }
    }
}
