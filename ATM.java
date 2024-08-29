
package com.mycompany.kirsten.code;
import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
    
    int balance = 1345,withdraw,deposit;
    
    Scanner scanner = new Scanner(System.in);
        
    while(true){
       
      System.out.print("Welcome! Please press a number to continue \n" ); 
      System.out.print("1 = Withdraw \n");
      System.out.print("2 = Deposit \n");
      System.out.print("3 = Check balance \n");
      System.out.print("4 = Exit \n");
      System.out.print("Please enter the number here: ");
     
    int choice = scanner.nextInt();
      
      switch (choice) {
          
          case 1:
              System.out.print("Please select amount to withdraw: ");
              
              withdraw = scanner.nextInt();
              
                 if (balance >= withdraw) {
           balance = balance - withdraw;
                    System.out.println("Please Get your money");
          } else { 
                  System.out.println("Error, please try again");   
                 }
              
             break;
             
          case 2: 
             System.out.print("Please select amount to deposit: "); 
                deposit = scanner.nextInt();
                balance = balance + deposit;
                System.out.println("The balance hass now added");
                System.out.println("");
                
                break;
                
          case 3:
              
             System.out.print("Balance: " + balance);
                System.out.println("");
             break;
             
             
          case 4 : 
              
              System.exit(0);
                          
              } 
}


    }
    
}