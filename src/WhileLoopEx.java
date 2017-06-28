import java.util.Scanner;

/**
 * Created by michelhayman on 6/28/17.
 */
public class WhileLoopEx {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

       String choice = "y";

        while (choice.equalsIgnoreCase("y")){ // while loop - if user puts y - continues

            //get some  input from the user and do some stuff

            System.out.println("Continue? (y/n) ");
            choice = scan.nextLine(); // choice is teh string - y

        }
        System.out.println("Goodbye"); // it is pushed out of the loop if user puts n
    }
}
