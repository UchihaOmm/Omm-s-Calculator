import java.util.*;

public class Calculator {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first and second number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add=1,Substract=2,Multiply=3,Division=4,Remainder=5");
        int c = sc.nextInt();
        System.out.println("Your Answer is: ");

        switch (c) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a % b);
            break;
            default: System.out.println("Invalid Token");

        }
    }



}
