// Conditional statements using if else in Java
import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        System.out.println("enter your marks : ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        System.out.println("Name is " + marks);
        if(marks==100){
            System.out.println("first class student");
        }
        else if(marks>=75){
            System.out.println("second class student");

        }
        else if(marks>=50){
            System.out.println("third class student");
        }
        else{
            System.out.println("waste student");
        }

    }
}