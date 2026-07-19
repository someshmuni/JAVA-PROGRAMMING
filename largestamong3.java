// Finding largest number among three numbers
import java.util.Scanner;
public class largestamong3{
    public static void main(String[] args) {
        System.out.println("enter 3 numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greater");
        }
        else if(b>=a && b>=c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is gretaer");
        }
    }
}