package javafundamental.Assignment;

import java.util.Scanner;

/*
Greatest of 2 num
Get 2 integer
compare 2 number
print the biggest number
 */
public class GreatestOfTwoNo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integer");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 ==num2)
            System.out.println("The Numbers are equal");
        else if(num1>num2)
            System.out.println("The Greatest value is " + num1);
        else
            System.out.println("The Greatest value is " + num2);


    }
}
