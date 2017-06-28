/**
 * Created by michelhayman on 6/28/17.
 */
public class DoWhileLoopEx {
    public static void main(String[] args) {

        // System.out.println("Hello World.");

        int i = 1;
        int month = 36;
        double futureValue = 0;
        double monthlyPmt = 330.63;
        double interestRate = 5.99 / 100;

        do {
            futureValue = (futureValue + monthlyPmt) * (1 + interestRate); // finding futurevalue
            i++; // iterator
        } while (i <= month); // if i is greater than 36 goes out of do

        System.out.println(futureValue); // prints futurevalue
    }
}
