package javafundamental.Assignment;
import java.util.Scanner;
/*
Get the quantity req. let the count per quantity =100
get the total cost
if value above 1000
give a discount of 10%
else print the total cost
 */

public class ShopDiscount {
    public static void main(String[] args) {
        int cost = 100;
        float total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity");
        float quantity = input.nextFloat();
        total = (float) cost * quantity;
        if (total > 1000) {
            float discount = (float) (total * 0.1);
            float discountAmount = total-discount;
            System.out.println("You have a discount of 10% your total amount is " + discountAmount);
        } else
            System.out.println("The total cost is " + total);
    }

}



