public class DivisibleByThreeFive {
    public static void main(String[] args) {
        System.out.println(" Numbers divided by 3: ");
        //applying for loop to output results as per requirements.
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + ", ");
        }
        System.out.println(" Numbers divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + ", ");
        }
        System.out.println(" Numbers divided by 3 and 5 : ");
        for (int i = 1; i<100; i++) {
            if (i % 3==0 && i % 5==0)
                System.out.println( i + ", ");
        }
    }

}