package javafundamental.Assignment;

import java.util.Scanner;

/*
Get the celcius temp
check if in range
convert to farenhiet
print result
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        celsius=input.nextFloat();
        if(celsius<=80&&celsius>=20) {
            float fahrenheit = (float) ((celsius * 1.8) + 32);
            System.out.println("The temperature in fahrenhiet "+fahrenheit);
        }
        else
            System.out.println("Enter a valid number");


    }
}
