package javafundamental.Assignment;

import java.util.Scanner;

/*
Get the age of three
get the bigger & smaller value
& equal value
print the result
 */
public class AgeCategory {
    public static void main(String[] args) {
        float age1, age2, age3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of 3 person");
        age1 = input.nextFloat();
        age2 = input.nextFloat();
        age3 = input.nextFloat();

        if ((age1 > age2) && (age1 > age3)) {
            if ((age1 != age2) && (age1 != age3))
                System.out.println("The oldest age is: " + age1);
        } else if ((age2 > age3) && (age2 > age1)) {
            if ((age2 != age1) && (age2 != age3))
                System.out.println("The oldest age is " + age2);
        } else if ((age3 != age1) && (age3 != age2))
            System.out.println("The oldest age is " + age3);


        if ((age1 < age2) && (age1 < age3)) {
            if ((age1 != age2) && (age1 != age3))
                System.out.println("The youngest age is: " + age1);
        } else if ((age2 < age3) && (age2 < age1))
            if ((age2 != age1) && (age2 != age3))
                System.out.println("The youngest age is " + age2);
            else if ((age3 != age1) && (age3 != age2))
                System.out.println("The youngest age is " + age3);

        if ((age1 == age2) || (age2 == age3) || (age1 == age3)) {
            if (age1 == age2) {
                if (age1 > age3)
                    System.out.println("The oldest age is" + age1);
                else
                    System.out.println("The youngest age is" + age1);
            }
            if (age1 == age3) {
                if (age1 > age2)
                    System.out.println("The oldest age is" + age1);
                else
                    System.out.println("The youngest age is" + age1);

            }
            if (age2 == age3) {
                if (age3 > age2)
                    System.out.println("The oldest age is" + age3);
                else
                    System.out.println("The youngest age is" + age3);

            }
        }
    }
}
