import java.util.Scanner;
public class SumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner used for user data input
        System.out.println(" Enter the first number to find sum value : ");
        int a1 = sc.nextInt();
        System.out.println(" Enter the last number to find sum value : ");
        int a2 = sc.nextInt();
        int sum = 0;
        //applying for loop
        for (int i = a1; i <= a2; i++) {
            sum = sum + i;
        }
            System.out.println(" The sum value is :"+ sum);

    }
}