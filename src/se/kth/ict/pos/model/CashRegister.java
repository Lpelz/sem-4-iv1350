package se.kth.ict.pos.model;

/**
 * Represents an CashRegister, that will store the payment from
 * the sale.
 */
public class CashRegister {
    
    private int runningTotal;
      
   /**
    * Adds the payment from the sale to the CashRegister.
    * @param payment The payed amount.
    */ 
    public void addPay(Payment payment){
       runningTotal = runningTotal + payment.getPaidAmount();        
    }
    /**
     * Removes necessary amount of change requested from 
     * CashRegister to give to customer.
     * @param payment Current payment.
     */
    public void removeChange(Payment payment){
        runningTotal = runningTotal - payment.getChange();
    }
    /**
     * 
     * @return The total balance stored in the CashRegister.
     */
    public int getTotal(){
       return this.runningTotal;
    }
    
}
