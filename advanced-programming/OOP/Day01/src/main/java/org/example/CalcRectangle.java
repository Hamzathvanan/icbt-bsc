package org.example;

import java.util.Scanner;

public class CalcRectangle {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter the length: ");
//        Double length = scanner.nextDouble();
//
//        System.out.println("Please enter the width: ");
//        Double width = scanner.nextDouble();
//
//        Rectangle rectangle = new Rectangle(length, width);
//
//        System.out.println("Rectangle Area: " + rectangle.area());
//
//        System.out.println("Rectangle Permeter: " + rectangle.perimeter());

//        System.out.println("************* ARRAY ************");
//        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.initiateArr3();
//        arrayPractice.printArr3();

//        System.out.println("************* ARRAY 02 ************");
//        ArrayPractice2 arrayPractice2 = new ArrayPractice2();
//        arrayPractice2.initiateArr();
//        arrayPractice2.displayArr();
//        arrayPractice2.summarizeArr();
//        arrayPractice2.averageArr();

        System.out.println("************* ARRAY 03 ************");
        MultiDimensionArray multiDimensionArray = new MultiDimensionArray();
        multiDimensionArray.initiateArrSize();
        multiDimensionArray.initiateArrValue();
        multiDimensionArray.printArrays();
    }
}
