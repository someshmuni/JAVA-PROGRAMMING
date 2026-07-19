// Java programming practice example
import java.util.Scanner;
public class example2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER MARKS YOU GOT: ");
        int a= sc.nextInt();
        System.out.println("MARKS YOU GOT: "+a);
        double percentage=(double)((double)((double)a/500)*100);
        System.out.println("PERCENTAGE IS :"+percentage);
sc.close();
    }}