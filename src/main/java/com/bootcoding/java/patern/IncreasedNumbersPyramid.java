package com.bootcoding.java.patern;

public class IncreasedNumbersPyramid {
    public static void main(String[] args) {
        printIncreaseNumberPyramid();

    }private static void printIncreaseNumberPyramid(){
        int sum = 1;
        int row = 4;
        for (int i = 1 ; i <= row  ; i++){
            for (int j = row-i ; j > 0 ; j--){
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print(sum + " ");
                sum = sum + 1;
            }
            System.out.println();
        }

    }
}
