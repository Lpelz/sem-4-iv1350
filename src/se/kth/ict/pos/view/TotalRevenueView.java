package se.kth.ict.pos.view;

import java.util.ArrayList;
import java.util.List;
import se.kth.ict.pos.model.SaleObserver;

/**
 * Observer that observes sale and prints total amount of revenue 
 * earned in purchases since program started.
 */

public class TotalRevenueView implements SaleObserver {
    
    private List <Integer> revenueList; 
    private int totalRevenue;
    /**
     * Constructor for TotalRevenueView.
     */
    public TotalRevenueView(){
       revenueList = new ArrayList<>();
    }
    
    /**
     * Displays total amount of revenue made from purchases
     * since start of program.
     */
    public void displayTotalRevenue(){
        totalRevenue = 0;
        for(Integer revenue : revenueList)
            totalRevenue += revenue;
          
        System.out.println("Total revenue earned from purchases since program started: "+ totalRevenue + "\n");      
    }
    /**
     * Add revenue to revenueList and display total revenue from all done 
     * purchases.
     * @param revenue The revenue from completed sale.
     */
    @Override
    public void add(int revenue){
        revenueList.add(revenue);
        displayTotalRevenue();
    }
        
}
