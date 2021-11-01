import java.util.Scanner;
public class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner for user data input
        System.out.println(" Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        //applying for loop
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println(" The Sum value is : "+ sum);
    }
}