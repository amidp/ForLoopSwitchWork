import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner for user data input
        System.out.println(" Enter the number to be reversed : ");
        int a = sc.nextInt();
        int num = 0;
        //applying for loop
         for (; a != 0; )
          {
            num = num * 10;
            num = num + a % 10;
            a = a / 10;
          }
        System.out.println( " The reversed result is : " + num);

    }
}