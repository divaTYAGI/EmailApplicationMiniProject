/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emailapplication;

import java.util.Scanner;

/**
 *
 * @author Tejasv Pratap Tyagi
 */
public class EmailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Email eml = new Email("John","Smith");
     System.out.println( eml.showInfo());
    System.out.println("Want to \n1. Change Mail Box Capacity\n2. Add Alternate mail \n3. Change Password");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    if(choice==1){
    System.out.println("Enter the new mail box capacity");
    int capacity = scan.nextInt();
    eml.setMailboxCapacity(capacity);
    System.out.println("Mail box capacity changed : "+ eml.getMailboxCapacity());
    }
    else if(choice==2){
    System.out.println("Enter the Alternate Email");
    String altemail = scan.next();
    eml.setAlternateEmail(altemail);
    System.out.println("Alternate Email Added : "+ eml.getAlternateEmail());
    
    }
    else if(choice==3){
    System.out.println("Enter the new password");
    String pass = scan.next();
    eml.setPassword(pass);
System.out.println("Password changed : "+ eml.getPassword());
        }
    } 
}
