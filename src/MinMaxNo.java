import java.util.Scanner;
public class MinMaxNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner for user data input
        System.out.println( " Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println(" Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println(" Enter the third number : ");
        int num3 = sc.nextInt();
        //applying if condition to check and output requirements.
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is the max number of three given numbers.");
        }
        else if (num2>num3){
            System.out.println(num2 + " is the max number of three given numbers.");
        }
        else
            System.out.println(num3 + " is the max number of three given numbers. ");
        if (num1<num2 && num1<num3){
            System.out.println(num1 + " is the min number of three given numbers.");
        }
        else if (num2<num3){
            System.out.println(num2 + " is the min number of three given numbers.");
        }
        else
            System.out.println(num3 + " is the min number of three given numbers. ");

    }
}
