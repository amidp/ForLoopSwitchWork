import java.util.Scanner;

public class PrintNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number between 23-33");
        System.out.println(" Enter the starting number : ");
        int a1 = sc.nextInt();
        System.out.println(" Enter the exit number : ");
        int a2 = sc.nextInt();
        for (int i = a1; i <= a2; i++) {
            System.out.println(i);
        }
    }
}