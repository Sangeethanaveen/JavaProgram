package javafundamental.BasicProgram2;
//Take integer inputs from user until he/she pressesq
//Ask to press q to quit after every integer input).
// Print average and product of all numbers.


import java.util.Scanner;

public class GetValueUntilString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();
        int s = Character.getNumericValue('q');
        try {
            while (n != s) {
                System.out.println("entered number");
                n = input.nextInt();
                System.out.println("input an integer to exit(q)");
            }
        }
        catch(Exception e){
            System.out.println("The code exits");
        }
    }
}
