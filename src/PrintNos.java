import java.util.Scanner;
public class PrintNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner used for user data input
        System.out.println(" Enter the starting number : ");
        int a1 = sc.nextInt();
        System.out.println(" Enter the exit number  : ");
        int a2 = sc.nextInt();
        int count = 0;
        //applying if condition
        if (a1<=a2) {
            // applying for loop
            for (int i = a1;i <= a2; i++)
            {
                System.out.println(i);
                count++;
                if (count == 10)
                {
                    break;
                }
            }
        }
         else {
                 System.out.println(" Invalid input");
         }
    }
}