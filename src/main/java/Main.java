import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    //Prompt user to input name
    //Greet users who are Alice and Bob
    public static void main(String[] args) {
        String userInput; //= String.valueOf(new Scanner(""));
        String out = "";

        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        userInput=input.nextLine();

        if (userInput.equalsIgnoreCase("Alice")) {
            System.out.println("Hello, Alice!");

        }
       else if (userInput .equalsIgnoreCase("Bob")) {
            System.out.println("Hello, Bob!");
        }

        else {
            System.out.println("Sorry. Access Denied");
        }

    }
}
