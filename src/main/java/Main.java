import java.util.Scanner;

public class Main {
    public static void maiGn(String[] args) {

//        Prompt user to input number
        System.out.println("Guess a number betweeen 1 and 10");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

//        If number is 8 print "correct!"
//        If number is greater than 8 print "too low"
//        If number is higher than 8 print "too high"

        if (number == 8) {
            System.out.println("Correct!");
        } else if (number < 8) {
            System.out.println("Too low");
        } else {
            System.out.println("Too high");
        }

    }
}
