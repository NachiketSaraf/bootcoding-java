package com.bootcoding.java.opps;

import java.io.OptionalDataException;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] element= new int[size];
        for (int i = 0; i<element.length;i++){
            System.out.println("Enter element");
            element[i] = scanner.nextInt();
        }

        LargestElement largestElement = new LargestElement();
        int res = largestElement.FindLrgest(element);
        System.out.println(res);

    }
    public static int FindLrgest(int[] element){
        int largest = element[0];
        for(int i = 0; i< element.length; i++){
            if(element[i] > largest){
                largest=element[i];
            }
        }
        return largest;
    }
}
