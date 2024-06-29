package org.example;

public class Main {

    public static void main(String[] args) {
        
        int numOne = 30;
        int numTwo = 20;

        System.out.println("Addition of " + numOne + " & " + numTwo + ": " + addition(numOne,numTwo));
        System.out.println("Subtraction of " + numOne + " & " + numTwo + ": " + subtraction(numOne,numTwo));
        System.out.println("Multiplication of " + numOne + " & " + numTwo + ": " + multiplication(numOne,numTwo));
        System.out.println("Division of " + numOne + " & " + numTwo + ": " + division(numOne,numTwo));
        System.out.println("Modulus of " + numOne + " & " + numTwo + ": " + mode(numOne,numTwo));

    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static float division(int a, int b) {
        return (float) a/b;
    }
    public static float mode(int a, int b){
        return (float) a%b;
    }
}