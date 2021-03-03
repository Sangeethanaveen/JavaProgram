package javafundamental.Assignment;

import java.util.Scanner;

/*
Get noofclass held & attended
print % of attendance
if attendance <75
check medical condition no
then student is not allowed to write exam
else
can attend exam
 */
public class StudentAttendance {
    public static void main(String[] args) {
        float attendendClass, heldClass;
        char medicalCondition;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of classes attended");
        attendendClass = input.nextInt();
        System.out.println("enter the classes held");
        heldClass = input.nextInt();
        System.out.println("Do you have medical condition(Y/N)");
        medicalCondition = input.next().charAt(0);
        float percentage = (attendendClass / heldClass) * 100;
        System.out.println("your attendance percentage is "+percentage);
        if (attendendClass > heldClass)
            System.out.println("enter a valid number");
        if (percentage >= 75)
                System.out.println("You can attend exams");
        if (percentage < 75) {
            if ((medicalCondition == 'y') || (medicalCondition == 'Y'))
                System.out.println("you can attend exams ");
            else
                 System.out.println("you cannot attend exams");
        }

    }
}
