/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoles;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {
    
     //Constructors passing parameters to superclass
    public ConsoleSales(String consoleType, String Store, int totalSales) {
        super(consoleType, Store, totalSales);
    }
   
    //Prints the formatted sales report
    public void printReport(){
        System.out.println("\n CONSOLE SALES REPORT");
        System.out.println("**************************");
        System.out.println("CONSOLE TYPE: "+ getConsoleType());
        System.out.println("STORE: "+ getStore());
        System.out.println("TOTAL SALES: "+ getTotalSales());
        
    }
    
    
}
