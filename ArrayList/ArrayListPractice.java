package javafundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of detail to be entered");
        n=input.nextInt();
        List<String> animal = new ArrayList<String>(n);
        List<String> bird = new ArrayList<String>(3);
        List<String> flower = new ArrayList<String>(n);
        System.out.println("Enter the animals List ");
        for(int i =0;i<n;i++){   //get input
            String name = input.nextLine();
            animal.add(name);
        }
        animal.set(0,"Lion");  //change item
        //s1.add(n+1,"Tiger");//out of bound
        //s1.add(n+2,"fox");
        System.out.println("the size of arraylist");
        System.out.println(animal.size());

        System.out.println(animal);
        bird.add("value1");
        bird.add("value2");
        bird.add("value3");
        bird.add("value4");
        System.out.println(bird);
        int i =0;
        System.out.println("Enter the flowers List ");
        while(i<n){
            String name = input.nextLine();
            flower.add(name);
            i++;
        }
        System.out.println(flower);
    }
}
