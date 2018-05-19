package se.kth.ict.pos.view;

import java.io.IOException;
import se.kth.ict.pos.controller.Controller;
import se.kth.ict.pos.controller.FailedOperationException;
import se.kth.ict.pos.model.InvalidItemIdentifierException;
import se.kth.ict.pos.model.ItemSpecification;
import se.kth.ict.pos.util.LogHandler;


/**
 * The program lacks a real view, this is a placeholder for it.
 */
public class View {
    private Controller contr;
    private ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
    private LogHandler logHandler;
  /**
   * Constructor for view.
   * 
   * @param contr The controller that handles all system operations.
   */ 
  public View(Controller contr)throws IOException{
    this.contr = contr;
    this.logHandler = new LogHandler();
    contr.addSaleObserver(new TotalRevenueView());
  }
  /**
   * Gives a simulation of user input leading to all system operations being 
   * executed.
   */     
  public void testExecution(){    
    
    contr.startSale();
    
    try{
    ItemSpecification regOne = contr.enterItemIdentifier(1,1);
    System.out.println("Item registered: " + regOne.toString()+ "\n");
    
    ItemSpecification regTwo = contr.enterItemIdentifier(2,4);
    System.out.println("Item registered: " + regTwo.toString()+ "\n");
    
    ItemSpecification regThree = contr.enterItemIdentifier(3,6);
    System.out.println("Item registered: " + regThree.toString() + "\n");
   
    ItemSpecification regFour = contr.enterItemIdentifier(4,3);
    System.out.println("Item registered: " + regFour.toString()+ "\n");
       
    ItemSpecification regFive = contr.enterItemIdentifier(9,4);
    System.out.println("Item registered: " + regFive.toString()+ "\n");    
    }
    catch(InvalidItemIdentifierException exc){
        handleOccuredException("Invalid itemID entered:" +"(" + exc.getItemIdentifier()+")" +"\n",exc);    
    }
    catch(FailedOperationException exc){
        handleOccuredException("Failed to correctly search for itemID",exc);
    }
    try{
    ItemSpecification regsix = contr.enterItemIdentifier(5,4);
    System.out.println("Item registered: " + regsix.toString()+ "\n"); 
    }
    catch(InvalidItemIdentifierException exc){
        handleOccuredException("Invalid itemID entered:" +"(" + exc.getItemIdentifier()+")" +"\n",exc);    
    }
    catch(FailedOperationException exc){
        handleOccuredException("Failed to correctly search for itemID"+ "\n",exc);
    }
 
    int total = contr.endSale();

    System.out.println("Total to pay: "+ total + "\n");
   
    contr.enterPayment(150);
    contr.sendSaleInfo();
  }
  /**
   * Handles occured exception by displaying user friendly error message,
   * and logging the exceptions error report in log file for developer.
   * @param message Error message
   * @param exc The occured exception.
   */
  private void handleOccuredException(String message, Exception exc) {
        errorMessageHandler.displayErrorMessage(message);
        logHandler.logOccuredException(exc);
    }
  
}
