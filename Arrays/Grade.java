package javafundamental.Arrays;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of marks to be entered");
        int n = input.nextInt();
        int sum=0;
        int[] marks=new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){   //array input
            marks[i]=input.nextInt();
        }
        System.out.println("The User enters "); //prints array
        for(int i=0;i<n;i++){

            System.out.print(marks[i]);
            System.out.print(",");
        }
        System.out.println(""); //sum & avg of array
        for(int i=0;i<n;i++){
            sum+=marks[i];
        }
        System.out.println("the sum of array is:  "+sum);
        int avg = sum/n;
        System.out.println("Average: "+avg);
        int max=0,min=marks[0];     //max&min value in array
        for(int i=0;i<n;i++){
            if(marks[i]>max)
                max=marks[i];
            else if(marks[i]<min)
                min=marks[i];
        }
        System.out.println("Highest mark "+max);
        System.out.println("Lowest mark "+min);
    }
}
