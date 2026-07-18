
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int div=a/b;
        System.out.println("int Division of a and b is :"+div);
        double div1=(double)a/b;
        System.out.println("double Division of a and b is :"+div1);
        double loss= (double)(div1-div);
        System.out.println("Loss is :"+loss);
        
    }
}