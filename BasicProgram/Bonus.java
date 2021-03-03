package javafundamental.Assignment;

import java.util.Scanner;

/*
Get the Salary & number of year
if number of year is more than 5
give bonus of 5%
else
the same salary
 */
public class Bonus {
    public static void main(String[] args) {
        float noOfYears;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of years");
        noOfYears = input.nextFloat();
        float salary;
        System.out.println("Enter the salary");
        salary = input.nextFloat();
        if(noOfYears>5)
        {
           float bonus = (float) (salary*0.05);
           float bonusWithSalary = bonus+salary;
            System.out.println("You have a bonus of 5%.your net salary is: "+bonusWithSalary);
        }
        else
            System.out.println("your salary is: "+salary);


    }
}
