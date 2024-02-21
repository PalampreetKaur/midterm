package midtermcarrental;

import java.util.Scanner;

public class MidtermCarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Car Rental System");
        System.out.println("Please enter the following questions to proceed with creating an account:");
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your year of birth:");
        int birthYear = sc.nextInt();
        sc.nextLine();

        Customer customer = new Customer(lastName, firstName, birthYear);
        if (!CustomerValidator.validate(customer)) {
            System.out.println("I'm sorry but you must be born on or before 2005 in order to create an account");
            return;
        }

        System.out.println("Account created, let's get a car for you...");
    }
}
