package javafundamental;
/*
Create Books class with name and ISBN
store the book object in list and retrieve them
Store books in map and fetch them based on the key from user
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BookDetail {
    int n;
    Scanner input = new Scanner(System.in);
    List<String> name = new ArrayList<String>(n);
    List<Integer> isbn = new ArrayList<>(n);
    HashMap<Integer,String> bookDetails = new HashMap<>(n);

    public void getDetails() {
        System.out.println("enter no of detail to be entered");
        n=input.nextInt();
        System.out.println("Enter the names the book");
        int i=0;
        while(i<n){
            String bookName = input.nextLine();
            name.add(bookName);
            i++;
        }
        System.out.println(name);
        System.out.println("Book Name");
        System.out.println(name);
        System.out.println("Enter the isbn number");
        for ( i = 0; i <n; i++) {
            int bookId = input.nextInt();
            isbn.add(bookId);
        }
        System.out.println("ISBN values");
        System.out.println(isbn);

    }
public void AddDetail(){
        for(int i=0;i<n;i++){
            bookDetails.put(isbn.get(i),name.get(i));
        }
    System.out.println("Book details with Isbn & Name");
    System.out.println(bookDetails);
}
}
class detail1{
    public static void main(String[]args){
        BookDetail book1 = new BookDetail();
        book1.getDetails();
        book1.AddDetail();


    }
}


