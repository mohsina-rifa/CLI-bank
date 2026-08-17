import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;

        /*
        choice-1 : show-balance
        choice-2 : deposit
        choice-3 : withdraw
        choice-4 : exit
        */
        int choice;
        // welcome message
        System.out.println("_______________________________________");
        System.out.println("          Welcome to CLI Bank          ");
        System.out.println("_______________________________________");

        System.out.println("What can we help you with?");

        System.out.println("Enter 1 to see your balance");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to withdraw amount");
        System.out.println("Enter 4 to exit");

        System.out.println("_______________________________________");

        while (isRunning) {
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> System.out.println("withdraw placeholder");
                case 4 -> isRunning = false;
                default -> System.out.println("You're not authorized for that option");
            }
        }

        //display menu

        //get & process users choice

        // showBalance()

        // deposit()

        // withdraw()

        // exit message

        scanner.close();
    }
      
    static void showBalance(double balance) {
        System.out.printf("Your current balance is : €%.2f\n",  balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Enter the amount you want to deposit: €");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            return amount;
        }

        return 0;
    }
}
