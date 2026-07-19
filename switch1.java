// Switch case statement example in Java
import java.util.Scanner;
public class switch1{
    public static void main(String[] args) {
        System.out.println("enter day : ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1 : System.out.println("MOnday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("wednesdsy");
            break;
            default:System.out.println("invalid");
        }
    }
}