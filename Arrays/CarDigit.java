package javafundamental.Arrays;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


/*Write a program to print random & unique car digit number
●Take input  from user for number of unique car number to generate
●Take format of card number to be MH{Random4digits}:MH3459
●Make sure number generated are not duplicate*/
public class CarDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] letter = new String[2];
        int[] number = new int[4];
        System.out.println("Enter 4 unique numbers");//array input
        for (int i = 0; i < 4; i++) {
            number[i] = input.nextInt();
        }
        for (int i = 0; i < 4; i++) {           //check duplicate value
            for (int j = i + 1; j < 4; j++) {
                if (number[i] == number[j]) {
                    System.out.println("Dulicate value found");
                    System.out.println("Enter unique value");
                    number[i] = input.nextInt();
                }
            }
        }
        System.out.println("Array is");  //print array
        for (int i = 0; i < 4; i++) {
            System.out.print(number[i]);

        }
        System.out.println("");
        System.out.println("Enter 2 letters"); //input letters
        letter[0] = input.next().toUpperCase();//convert to uppercase
        letter[1] = input.next().toUpperCase();
        if (!(letter[0].equals(letter[1]))) {   //checks for duplicate
            System.out.print(letter[0]);
            System.out.print(letter[1]);
        }
        else {
            System.out.println("Duplicate value enter a unique letter");
            letter[0] = input.next().toUpperCase();
        }

        System.out.println("The car number is\n");  //print car number
        for (int i = 0; i < 2; i++) {
            System.out.print(letter[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(number[i]);
        }
    }
}



