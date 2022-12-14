package Model;


import java.util.List;

public class ATM {
     public int AtmUserId;
     public String AtmUserName;
     public int AccoutNumber;
     public int Balance;

     public ATM(int atmUserId, String atmUserName, int accountNumber, int balance) {
         AtmUserId = atmUserId;
         AtmUserName = atmUserName;
         AccoutNumber = accountNumber;
         Balance = balance;

     }



     public int getAtmUserId() {
         return AtmUserId;
     }

     public void setAtmUserId(int atmUserId) {
         AtmUserId = atmUserId;
     }

     public String getAtmUserName() {
         return AtmUserName;
     }

     public void setAtmUserName(String atmUserName) {
         AtmUserName = atmUserName;
     }

     public int getAccountNumber() {
         return AccoutNumber;
     }

     public String getAccountHolderName(){
         return  this.AtmUserName;
     }

     public void setAccoutNumber(int accoutNumber) {
         AccoutNumber = accoutNumber;
     }

     public int getBalance() {
         return Balance;
     }

     public void setBalance(int balance) {
         Balance = balance;
     }

     @Override
     public String toString() {
         return "ATM{" +
                 "AtmUserId=" + AtmUserId +
                 ", AtmUserName='" + AtmUserName + '\'' +
                 ", AccoutNumber=" + AccoutNumber +
                 ", Balance=" + Balance +
                 '}';
     }

     public void setAccountHolderName(String name) {
        this.AtmUserName = name;
     }

     public void setAccountNumber(int accNo) {
         this.AccoutNumber = accNo;
     }

     public int withdraw(int withDrawAmount) {
         if(withDrawAmount > this.Balance){
             System.out.println("Your available balance is lower than current amount!");
             return 0;
         }else
             return this.Balance - withDrawAmount;
     }

     public String getName() {
         return  this.AtmUserName;
     }


     public int getId() {
         return  this.AtmUserId;
     }
 }
