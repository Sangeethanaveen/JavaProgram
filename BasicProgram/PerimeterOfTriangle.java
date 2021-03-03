package javafundamental.Assignment;
/*
get 3 sides of triangle
add the sides
print the result
 */
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        float s1,s2,s3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle");
        s1 = input.nextFloat();
        s2 = input.nextFloat();
        s3 = input.nextFloat();
        float perimeter = s1+s2+s3;
        System.out.println("The perimeter of triangle= "+perimeter);
    }
}
