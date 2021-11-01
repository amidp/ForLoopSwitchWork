import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//scanner for user data input.
        System.out.println(" Enter the number for timetable : ");
        int num = sc.nextInt();//number to print timetable for
        int range = 12;//till which number timetable should print
        //applying for loop to get required out put
        for (int i = 1; i<=range;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
