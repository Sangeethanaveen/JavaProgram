package javafundamental.Assignment;

import java.util.Scanner;

/*
Get a length and breath
check if length equals breath
if true its square
else its a rectangle
 */
public class CheckIfSquare {
    public static void main(String[] args) {
        float length,breath;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = input.nextFloat();
        System.out.println("Enter the breath");
        breath = input.nextFloat();
        if(length==breath)
            System.out.println("Its a square");
        else
            System.out.println("Its a rectangle");


    }
}
