package javafundamental.Assignment;

import java.util.Scanner;
/*
Get the number
intialize i =1
multiply the num*i
increment i
loop until i=num
print the value
 */
public class Factorial {
    public static void main(String[] args) {
        int n,factorial=1;
        int i=1;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while(i<=n){
            factorial= factorial*i;
            i++;


        }
       System.out.printf("the factorial of " +n+ " is "+factorial);
    }
}
