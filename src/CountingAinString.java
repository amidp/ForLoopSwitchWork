import java.util.Scanner;
public class CountingAinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the string to count 'a' in it : ");
        String str =sc.nextLine();
        int count =0;
        int i = 0;
        for (i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
                count++;
        }
        System.out.println(" Total number of 'a' in the string : "+ count);
    }
}