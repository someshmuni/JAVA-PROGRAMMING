import java.util.Scanner;
public class palindrome {
    public static void main (String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        int rev=0;
        if(n>=0){
        rev=rev*10+n%10;
        n=n/10;
        {
            if(rev==n){
                System.out.println("The number is a palindrome");
            }
            else{
                System.out.println("The number is not a palindrome");
            }}
            System.out.println("The reverse of the number is: "+rev);
        }
    }
}