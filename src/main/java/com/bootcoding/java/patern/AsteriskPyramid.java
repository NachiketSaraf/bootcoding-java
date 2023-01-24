package com.bootcoding.java.patern;

public class AsteriskPyramid {
    public static void main(String[] args) {
     printAsteriskPyramid();
    }
    private static void printAsteriskPyramid(){
        int row = 4;
        for (int i = 1 ; i <= row  ; i++){
            for (int j = row-i ; j >0 ; j--){
                System.out.print(" ");
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
