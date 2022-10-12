
import AtmReposotory.AtmReposotory;
import Model.ATM;

import java.sql.SQLException;
import java.util.Scanner;

public class Main extends AtmReposotory {

    public Main() throws SQLException {
    }

    public static void withdraw(ATM user){
        Scanner input = new Scanner(System.in);
        System.out.println("Alright. Would you like to withdraw? Press 'y' for yes or 'n' for no");
        char input2 = input.next().charAt(0);
        if(String.valueOf(input2).toLowerCase().equals("y")){
            System.out.println("Please enter your amount to withdraw: ");
            int amount = input.nextInt();
            if(amount > user.getBalance()){
                System.out.println("Your current balance is lower i.e balance is " + user.getBalance()+" and your amount is "+ amount+"...!");

            }else{
                user.setBalance(user.getBalance());
                System.out.println("Your new balance is : " + user.getBalance());
            }
        }
        else if(String.valueOf(input2).toLowerCase().equals("n")){
            System.out.println("Alright. thanks for coming!");
        }
        else {
            System.out.println("Invalid selection!");
        }
    }

    public static void main(String[] args) throws SQLException {

        ATM user1ATM = new ATM(404,"Unknown",4545);

        AtmReposotory repo = new AtmReposotory();

        ATM user = new ATM(0, "", 0);

        Scanner input = new Scanner(System.in);
        System.out.println("Please select any task you want to do:\n "+"" +
                "1. Login to your account and perform all essential activities. ");


        int userInput = input.nextInt();
        switch(userInput)  {
            case 1:
                System.out.println("Please enter your full name: ");
                String name = input.next();

                System.out.println("Please enter your pin number: ");
                int accNo = input.nextInt();
                System.out.println("Please enter your your id: ");
                int userId = input.nextInt();

                user.setAccountHolderName(name);
               user.setAtmUserId(userId);
               user.setAccountNumber(accNo);
                System.out.println("Registered successfully!");
                System.out.println("Please deposit some money as your currently account balance is 0. Press 'y' for yes or 'n' for no.");
                char inputt = input.next().charAt(0);
                if(inputt == 'y' || inputt=='Y'){
                    System.out.println("Enter the amount you wanna deposit : ");
                    int amount = input.nextInt();
                    user.setBalance(amount);
                    System.out.println("You have successfully deposited "+amount+ " in you account");
                    withdraw(user);
                }else if(inputt == 'n' || inputt=='Y'){
                    System.out.println("Okay, your account balance will be 0. Thanks");

                }else{
                    System.out.println("Invalid selection!");
                }

                System.out.println("If you want to check balance please press 'y' for yes or 'n' for no: ");
                char yesOrno = input.next().charAt(0);
                if(yesOrno == 'y' || yesOrno=='Y'){
                    System.out.println("Checking the balance...");
                    System.out.println(user.getAtmUserName() + ", your balance is currently $" + user.getBalance() +". thanks for coming!");
                }else if (yesOrno == 'n' || yesOrno=='N'){
                    withdraw(user);
                }
                break;

            default:
                System.out.println("Invalid selection");
                break;
        }

    }

}

