package javafundamental.Assignment;

import java.util.Scanner;

//Write a Java program to print an int, a double anda char on screen.
/* get a int, char and double
print the values
 */
public class Datatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num= input.nextInt();
        System.out.println("Enter a character");
        char letter= input.next().charAt(0);
        System.out.println("Enter a double value");
        double value=input.nextDouble();
        System.out.println(num);
        System.out.println(letter);
        System.out.println(value);

    }
}
