import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;

        /*
        choice-1 : show-balance
        choice-2 : deposit
        choice-3 : withdraw
        choice-4 : exit
        */
        int choice;

        // welcome message
        System.out.println("___________________________");
        System.out.println("    Welcome to CLI Bank    ");
        System.out.println("___________________________");

        System.out.println("What can we help you with?");

        System.out.println("Enter 1 to see your balance");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to withdraw amount");
        System.out.println("Enter 4 to exit");

        System.out.println("___________________________");
        System.out.print("Enter your choice(1-4): ");
        choice = scanner.nextInt();

        //display menu

        //get & process users choice

        // showBalance()

        // deposit()

        // withdraw()

        // exit message

        scanner.close();
    }
}
