
// Calculator using switch case
import java.util.Scanner;
public class calcswitch{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a: ");
    int a=sc.nextInt();
    // System.out.println("enter a: "+a);
       
 System.out.println("enter b: ");
    int b=sc.nextInt();
    // System.out.println("enter b: "+b);
    System.out.println("enter operator: ");
    int op=sc.nextInt();
    
    switch(op){
        case 1: System.out.println("add is "+(a+b));
        break;
          case 2: System.out.println("sub is "+(a-b));
        break;
          case 3: System.out.println("mul is "+(a*b));
        break;
          case 4: System.out.println("div is "+(a%b));
        break;
        default: System.out.println("invalid");
    }

}
}