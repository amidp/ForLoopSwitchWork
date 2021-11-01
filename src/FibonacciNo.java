import java.util.Scanner;
public class FibonacciNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner for user data input
        System.out.println(" Enter the number to print for Fibonacci sequence: ");
        int n = sc.nextInt();
        int prv =0;
        int nx =1;
        //applying loop for required out put sequence.
        for (int i=1;i<=n;i++)
        {
            System.out.println(prv+"");
            int ans = prv+nx;
            prv=nx;
            nx=ans;
        }
    }
}