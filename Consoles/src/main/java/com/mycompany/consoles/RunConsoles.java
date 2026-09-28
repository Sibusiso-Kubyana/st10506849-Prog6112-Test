/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoles;

import java.util.*;



public class RunConsoles {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int option = 0;

      //Menu for slecting types of
      do{

       
        System.out.println();
         System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        
        option = input.nextInt();

        switch(option){
          case 1:
            System.out.print("ENTER THE STORE:");
            String Store = input.nextLine();
            
            System.out.print("Enter the total sales of PS5 consoles for");
            int totalSales = input.nextInt();
            break;
            
        case 2:
             System.out.print("ENTER THE STORE:");
            String Store = input.nextLine();
            
            System.out.print("Enter the total sales of XBOX consoles for",Store);
            int totalSales = input.nextInt();
            break;
          
          case 3:
           System.out.print("ENTER THE STORE:");
            String Store = input.nextLine();
            
            System.out.print("Enter the total sales of SWITCH consoles for",name);
            int totalSales = input.nextInt();
            break;
        }
             while(option !=3);

      input.close();
      }
      }
}
            

