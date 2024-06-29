package org.example;

import java.util.Scanner;

public class MultiDimensionArray {

    int x;
    int z;
    int arr [][] = new int[x][z];

    public void initiateArrSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number of rows");
        x = scanner.nextInt();

        System.out.println("Please insert the number of columns");
        z = scanner.nextInt();
    }

    public void initiateArrValue(){
        int cellCount = x*z;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the value" + "(" + (cellCount-1) + " more to enter): \n" );
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void printArrays(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
