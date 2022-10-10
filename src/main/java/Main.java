
import AtmReposotory.AtmReposotory;
import Model.ATM;

import java.sql.SQLException;
import java.util.Scanner;

public class Main extends AtmReposotory {

    public Main() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {

        ATM user1ATM = new ATM(404,"Unknown",4545);

        AtmReposotory repo = new AtmReposotory();

        Scanner input = new Scanner(System.in);
        System.out.println("Please select any task you want to do:\n "+"" +
                "1. Register yourself +" +
                "\n2. Check the balance" +
                "\n3. Withdraw money"  );

        String userInput = input.next();
        switch(userInput)  {
            case "1":
                System.out.println("Please enter your name: ");
                String name = input.nextLine();
                System.out.println("Please enter your account number: ");
                int accNo = input.nextInt();
                System.out.println("Please enter your id: ");
                int userId = input.nextInt();
                user1ATM.setAccountNumber(userId);
                user1ATM.setAccountHolderName(name);
                user1ATM.setAtmUserId(userId);
                System.out.println("Registered successfully!");
                break;

            case "2":
                System.out.println("Checking the balance");
                break;

            case "3":
                System.out.println("Withdrawing the money");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }

    }
}

