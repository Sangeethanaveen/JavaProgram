package javafundamental.BasicProgram2;
import java.util.Scanner;
public class WorkLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char gender,martialStatus;
        int age;
        System.out.println("Are you Male or Female(M/F)");
        gender=input.next().charAt(0);
        System.out.println("Are you married(Y/N)");
        martialStatus=input.next().charAt(0);
        System.out.println("Enter your age");
        age = input.nextInt();
        if((gender=='f')||(gender=='F')){
            System.out.println("You will work in urban are");
        }
        else if((gender=='m')||(gender=='M')){
            if((age>20)&&(age<40)){
                System.out.println("You can work anywhere");
            }
            if((age>40)&&(age<60)){
                System.out.println("You will work in urban area");
            }
        }
        else
            System.out.println("Invalid input");

    }
}
