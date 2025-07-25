import java.util.Scanner;

public class NameWelcome {

    public static void main(String[] args) {
        try(Scanner scnr = new Scanner(System.in)) {
            String firstName;
            String lastName;

            System.out.println("Enter first name: ");
            firstName = scnr.nextLine(); // Gets entire line up to ENTER

            System.out.println("Enter last name: ");
            lastName = scnr.nextLine(); // Gets entire line up to ENTER

            System.out.println();
            System.out.println("Welcome " + firstName + " " + lastName + "!");
            System.out.println("May I call you " + firstName + "?");
        }
    }
}
