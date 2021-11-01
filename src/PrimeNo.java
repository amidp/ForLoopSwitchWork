import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner for user data input
        System.out.println(" Enter a number : ");
        int a = sc.nextInt();
        int f = 1;
        //applying for loop
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                f = f * i;
            }
        }
        //applying if condition
        if (f == a)
            System.out.println(" This is a prime number. ");
        else {
            System.out.println(" This is not a prime number.");
        }
    }
}