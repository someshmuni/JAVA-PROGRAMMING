// Program to calculate sum of n numbers
import java.util.Scanner;
public class sumofn {
    public static void main(String[] args) {
        int n ; // Example value for n
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}