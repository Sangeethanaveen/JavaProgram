package javafundamental.Assignment;

import java.util.Scanner;
/*
Get the mark
if above 80 print A
60-80 print B
50-60 print C
45-50 print D
25-45 -print E
below 25 F
 */
public class StudentGrade {
    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark");
        mark = input.nextInt();
        if((mark>80)&&(mark<=100))
            System.out.println("Grade is A");
        else if((mark<=80)&&(mark>60))
            System.out.println("Grade is B");
        else if((mark<=60)&&(mark>50))
            System.out.println("Grade is C");
        else if((mark<=50)&&(mark>45))
            System.out.println("Grade is D");
        else if((mark<=45)&&(mark>25))
            System.out.println("Grade is E");
        else if(mark<=25)
            System.out.println("Grade is F");
        else
            System.out.println("Enter a valid mark");



    }
}
