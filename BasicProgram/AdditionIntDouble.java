package javafundamental.Assignment;

import java.util.Scanner;

//Write a program to add an integer variable having value 5 and a double variable having value 6.2.
/*
Get a int and double value
Print the sum in int & double
 */
public class AdditionIntDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num1 = input.nextInt();
        System.out.println("Enter a double value");
        double num2 = input.nextDouble();
        int sum = (int) (num1+num2);
        System.out.println("The sum in integer:"+sum);
        double value = num1+num2;
        System.out.println("The sum in double:"+value);

    }
}
