//Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
/*Get the value of length & breath
Multiply the value
print the result*/
package javafundamental.Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        float length = input.nextFloat();
        System.out.println("Enter breath of rectangle ");
        float breath = input.nextFloat();
        double area = length*breath;
        System.out.println("area of rectangle = "+area);
    }
}
