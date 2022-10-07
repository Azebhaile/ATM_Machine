package Model;

// create online shop
// it should have username and password,it's the username and pass; correct it passed
// add few products with their price

//MVP
// withdraw
// Deposit Funds
// setting the count number and username



// to come
// setup the passwored
// View Balance
///-----------
// this should be connected with db


// what should i do?
// on database create a colum (table name should be ATM)
//

 class ATM {
     public int AtmUserId;
     public String AtmUserName;
     public int AccoutNumber;
     public int Balance;

     public ATM(int atmUserId, String atmUserName, int accoutNumber, int balance) {
         AtmUserId = atmUserId;
         AtmUserName = atmUserName;
         AccoutNumber = accoutNumber;
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

     public int getAccoutNumber() {
         return AccoutNumber;
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
 }
