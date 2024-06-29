package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    int arr [] = {3,2,4,5,4};
    int[] arr2 = {3,2,4,5,4};
    int arr3[] = new int[5];

    public void initiateArr3() {
        for (int i = 0; i < arr3.length; i++) {
            Random rand = new Random();
            arr3[i] = rand.nextInt(20);
        }
    }
    public void printArr3(){
        for (int i =0; i < arr3.length; i++) {
            System.out.println("Index" + "[" + i + "]" + ": " + arr3[i]);
        }


    }
}
