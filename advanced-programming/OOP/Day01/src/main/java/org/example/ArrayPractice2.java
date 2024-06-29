package org.example;

import java.util.Scanner;

public class ArrayPractice2 {
    double arr[] = new double[10];
    double summary;

    double average;
    public void initiateArr() {
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter the decimal value for Index" + "[" + i +"]: ");
            arr[i] = scanner.nextDouble();
        }
    }
    public void displayArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index" + "[" + i + "]" + ": " + arr[i]);
        }
    }
    public void summarizeArr(){
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        System.out.println("Summary value: " + summary);
    }
    public void averageArr(){
        average = summary / arr.length;
        System.out.println("Average value: " + average);
    }
}
