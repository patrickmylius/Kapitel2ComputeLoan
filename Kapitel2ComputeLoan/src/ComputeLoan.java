import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate in percentage, e.g. 7.25
        System.out.println("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble(); //Allows user to input annual interest rate in console


        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Enter number of years.
        System.out.println("Enter amount of years : ");
        int numberOfYears = input.nextInt(); //Allows user to input amount of years in console

        //Enter loan amount.
        System.out.println("Enter loan amount : ");
        double loanAmount = input.nextDouble(); //Allows user to input loan amount in console

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //Display result
        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);


        }
}
