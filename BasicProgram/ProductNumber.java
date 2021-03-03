package javafundamental;
//Write a program to print the product of the numbers 8.2 and 6.
/* Get the float values of 2 numbers
print the product value
 */

import java.util.Scanner;

public class ProductNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number");
        float num1 =input.nextFloat();
        float num2 =input.nextFloat();
        float product;
        product = num1*num2;
        System.out.println("Product of 2 numbers "+product);
    }
}
