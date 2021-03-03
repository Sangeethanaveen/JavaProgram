package javafundamental.Assignment;

import java.util.Scanner;

//Write a program to find the square of the number 3.9.
/*
get a float value
Multiply the number by itself
print the value
 */
public class SquareNumber {
    public static void main(String[] args) {
        float num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num = input.nextFloat();
        float square= num*num;
        System.out.println("the square of the number "+square);
    }
}
