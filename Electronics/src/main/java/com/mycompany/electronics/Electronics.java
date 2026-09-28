/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronics;

/**
 *
 * @author Student
 */
public class Electronics {

    public static void main(String[] args) {
        
        //Single dimensional array
        String[] provinces={"Cape Town","Port Elizabeth","Pretoria"};
        int[] totals = new int[provinces.length];
        
        //2D array
        int[][] sales={
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
        };
        
        
        // Displaying header for gaming console report
        System.out.println("--------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-20s%-18s%-18s%-18s%n","","PS5","XBOX","SWITCH");
        
        //track maximum sales and minimum sales across the 2d array
        
        int maxSales =-1;
        int maxProvinceIndex=0;
        
        //Output tables rows and evaluating statistics
        for(int i=0; i<provinces.length; i++){
           
            System.out.printf("%-20s%-18s%-18s%-18d%n", provinces[i],sales[i][0],sales[i][1],sales[i][2]);
            
            //sum for consoles
            totals[i] = sales[i][0] +sales[i][1] +sales[i][2];
            
            //determining city with highest sales
            if(totals[i] >maxSales){
                maxSales=totals[i];
                maxProvinceIndex =i;
            }
            
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
       System.out.println("--------------------------------------------------------------------");
        
        //output totals for esach city
        for(int i=0; i<provinces.length; i++){
            System.out.printf("%-20s%d%n",provinces[i],totals[i]);
        }
        
        System.out.println();
        
        System.out.println("CITY WITH THE MOST SALES :" +provinces[maxProvinceIndex]);
       System.out.println("--------------------------------------------------------------------");
        
        
        
    }
}
