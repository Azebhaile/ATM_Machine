
import java.util.Scanner;

/*
* System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your customer Number");
				setCustomerNumber(menuInput.nextInt());
*/

/*
public void getAccountType() {
		System.out.println("Select the Account you Want to Access: ");
		System.out.println(" Type 1 - Checking Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit");
* */

/*
case 3:
			System.out.println("Thank You for using this ATM, bye.  \n");
			break;

* */

/*
public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Funds");
		System.out.println(" Type 3 - Deposit Funds");
		System.out.println(" Type 4 - Exit");
		System.out.print("Choice: ");

* */

/* switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
* */
public class Main extends ATM{

    public static void main(String[] args) {

        ATM user1ATM = new ATM();

        Scanner input = new Scanner(System.in);



        user1ATM.setBalance(4500);

        System.out.println("Please enter your name : ");
        String name = input.nextLine();
        user1ATM.setAccountHolderName(name);

        System.out.println("Username: "+ user1ATM.getAccountHolderName());

        System.out.println("Please enter your account number : ");
        long accNo = input.nextInt();
        user1ATM.setAccountNumber(accNo);

        System.out.println("user account number: " + user1ATM.getAccountNumber());

        System.out.println("Your balance is " + user1ATM.getBalance());

        // withdrawing $500 from my account
        System.out.println("Please enter withdrawal amount : ");
        long withDrawAmount = input.nextLong();

        System.out.println("Withdrawing "  + withDrawAmount +  "  from account  : " + user1ATM.withdraw(withDrawAmount));

        System.out.println("Now after withdrawing, my  balance is " + user1ATM.getBalance());
    }
}

