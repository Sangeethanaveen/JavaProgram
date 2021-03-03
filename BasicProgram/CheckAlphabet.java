package javafundamental.Assignment;

import java.util.Scanner;

/*
get a char
convert the char to ascii
if ascii lies in the range 65-90 its uppercase
else if lies b/w 97 to 122 its lowercase

 */
public class CheckAlphabet {
    public static void main(String[] args) {
        char l;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        l=input.next().charAt(0);
        int ascii = (int) l;
        if((ascii>=65)&&(ascii<=90))
            System.out.println("the character is uppercase");
        else if((ascii>=97)&&(ascii<=122))
            System.out.println("the character is lowercase");
        else
            System.out.println("Enter a valid alphabet");

    }
}
