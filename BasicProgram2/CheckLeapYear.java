package javafundamental.BasicProgram2;

import java.util.Scanner;

//Write a program to check if a year is leap year or not.
/*
get a number
check divisible by 4
if condition satisfy
its leap year
else
not a leap year
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        year = input.nextInt();
        if(year%4==0){
            System.out.println("Its is a leap year");
        }
        else
            System.out.println("Its is not a leap year");
    }
}
