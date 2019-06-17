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
public class Email {
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   private String department;
   private int mailboxCapacity = 500;
   private int defaultpasswordLength = 10;
   private String alternateEmail;
   private String companySuffix="anycompany.com";
   //Constructore to recieve first name and last name; 
   public Email(String firstName, String lastName)
   {
   this.firstName = firstName;
   this.lastName = lastName;
   //Call a method asking for department - return department
   this.department = setDepartment();
   //Call a method that returns Randompassword
   this.password= randomPassword(defaultpasswordLength);
   //Combine elements to generate Email
   email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
   }
   // Ask fo department
   private String setDepartment(){
   System.out.println("Department Code\n1. For Sales\n2. For Development\n3. For Accunts\n0. For None");
   System.out.println("Enter the Code");
   Scanner in = new Scanner(System.in);
   int depChoice =in.nextInt();
   if(depChoice==1)
        {return "sales";}
   else if(depChoice==2)
        {return "development";}
   else if(depChoice==3)
        {return "accounting";}
   else
        {return "others";}

   }
   //Generate random passoword
   private String randomPassword(int length){
   String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@_+%$";
   char[] password = new char[length];
   for( int i=0 ;i<length ;i++){
       int rand = (int)(Math.random()*passwordSet.length());
       password[i]= passwordSet.charAt(rand);
     }
   return new String(password);
   }
   // Set mail capacity
   
   public void setMailboxCapacity(int capacity){
   this.mailboxCapacity = capacity;
   }
   //Set alternate email
   public void setAlternateEmail(String altEmail){
   this.alternateEmail= altEmail;
   }
   //Change the password
   public void setPassword(String password){
   this.password = password;
   }
   public int getMailboxCapacity(){
   return mailboxCapacity;
   }
    public String getAlternateEmail(){
   return alternateEmail;
   }
    public String getPassword(){
   return password;
   }
    public String showInfo(){
    return "Dispay Name: " + firstName +" "+lastName+
            "\nPassword: "+password+
            "\nCompany Email: " + email+
            "\nMailBox Capacity: "+mailboxCapacity+"mb";
    }
}
