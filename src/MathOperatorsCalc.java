import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class MathOperatorsCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner for user data input.
        System.out.println(" Enter the first number : ");
        int a = sc.nextInt();
        System.out.println(" Enter the second number : ");
        int b = sc.nextInt();
        System.out.println(" Select any one symbol from(+,-,/,*)");
        String sym = sc.next();
        int res;
        //switch case applying to get required out put.
        switch (sym) {
            case "+": res = a+b;
                System.out.println(" Addition of two numbers is : "+ res);
                break;
            case "-": res=a-b;
                System.out.println(" Subtraction of two numbers is : "+ res);
                break;
            case "*": res=a*b;
                System.out.println(" Multiplication of two number is : "+ res);
                break;
            case "/" : res=a/b;
                System.out.println(" Division of two numbers is : "+ res);
                break;
            default:
                System.out.println(" Invalid Input.");
                break;
        }
    }
}