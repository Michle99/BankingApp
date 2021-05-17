/*   
A simple banking application 
source: https://www.youtube.com/watch?v=wQbEH4tVMJA&t=6s


*/

import java.util.Scanner;

public class BankingApp {

   public static void main(String[] args){
      
      //already entered user details
        //  BankAccount customer = new BankAccount("Kelly", "ABD12455");
        
        
      BankAccount customer = new BankAccount();/* Used for getting customer details through scanner    */
      customer.showMenu();
   }
}

class BankAccount {
   int balance;
   int previousTransaction;
   String customerName;
   String customerId;

   //Make a BankAccount Constructor to use without getting user details
   // BankAccount(String custname, String cusid) {
      // customerName = custname;
      // customerId = cusid;
   // }

   void deposit(int amount) {
      if(amount != 0) {
         balance = balance + amount;
         previousTransaction = amount;
      }
      else {
         System.out.println("Enter amount");
      }
   
   }

   void withdraw(int amount) {
      if (amount != 0){
         balance = balance - amount;
         previousTransaction = -amount;
      }
   }

   void getPreviousTransaction() {
      if (previousTransaction > 0) {
         System.out.println("Deposited: "+previousTransaction);
      }
      else if (previousTransaction < 0) {
         System.out.println("Withdrew: "+Math.abs(previousTransaction));
      }
      else {
         System.out.println("No transaction occurred.");
      }
   }

   void showMenu() {
   
      char options = '\0';
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter your name: ");
      String customerName = scanner.nextLine();
      
      System.out.println("Enter your Customer ID is: ");
      String customerId = scanner.nextLine();
     
     
      System.out.println("\n");
      System.out.println("A ==> Check Balance");
      System.out.println("B ==> Deposit");
      System.out.println("C ==> Withdraw");
      System.out.println("D ==> Previous Transactions");
      System.out.println("E ==> Exit");
   
      do {
         System.out.println("--------------------------------------");
         System.out.println("Please Enter an options to Continue:");
         System.out.println("\n");//-----
         options = scanner.next().charAt(0);
         System.out.println("\n");
      
         switch(options) {
            case 'A':
               System.out.println("******************");
               System.out.println("Balance = "+balance);
               System.out.println("******************");
               System.out.println("\n");
               break;
         
            case 'B':
               System.out.println("******************");
               System.out.println("Please Enter an amount to deposit: ");
               System.out.println("******************");
               int amount = scanner.nextInt();
               deposit(amount);
               System.out.println("\n");
               break;
         
         
            case 'C':
               System.out.println("******************");
               System.out.println("Please Enter an amount to withdraw: ");
               System.out.println("******************");
               int amount2 = scanner.nextInt();
               withdraw(amount2);
               System.out.println("\n");
               break;
         
         
         
            case 'D':
               System.out.println("******************");
               getPreviousTransaction();
               System.out.println("******************");
               System.out.println("\n");
               break;
         
            case 'E':
               System.out.println("******************");
               break;
         
         
            default: 
               System.out.println("Invalid options! Please Enter a Correct options.");
               break;
         }
      
      } while (options != 'E');
      System.out.println("Thank you for banking with Us. Have a nice day ahead!");
   }
}