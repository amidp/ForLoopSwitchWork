import java.util.Scanner;
public class FactorialOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner for user input
        System.out.println(" Enter th number : ");
        int a = sc.nextInt();
        long b = 1;
        //applying loop for required output.
        for ( int i =1; i<=a;i++)
        {
            b=b*i;
        }
        System.out.println(" Factorial of" + a + " is :" +b);
    }
}
