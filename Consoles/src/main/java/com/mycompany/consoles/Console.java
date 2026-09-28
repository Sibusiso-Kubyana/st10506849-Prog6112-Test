/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoles;

/**
 *
 * @author Student
 */
public abstract class Console implements IConsoles {
    
  private String consoleType;
  private String Store;
  private int totalSales;
  
  public Console(String consoleType,String Store,int totalSales){
      this.Store= Store;
      this.consoleType = consoleType;
      this.totalSales = totalSales;
  }
  
  @Override
  public String getConsoleType() {
      return consoleType;
  }
  
  @Override
  public String getStore(){
      return Store;
  }
  @Override
  public int getTotalSales(){
       return totalSales;
   }
}
