package se.kth.ict.pos.model;

/**
 * Exception that is thrown when a itemIdentifier is entered that has no 
 * matching item in the StoreCatalog.
 */
public class InvalidItemIdentifierException extends Exception {
    private int itemIdentifier; 
    /**
     * Creates a new instance of the exception with error message 
     * that invalid itemIdentifier has been entered.
     * 
     * @param itemIdentifier Entered id to search for item in StoreCatalog.
     */
   public InvalidItemIdentifierException(int itemIdentifier){
      
    super("No item exist in StoreCatalog with entered itemIdentifier: " + itemIdentifier+ " ");
    this.itemIdentifier = itemIdentifier;
   
   }
   /**
    * 
    * @return Invalid itemIdentifier.
    */
   public int getItemIdentifier(){
       return this.itemIdentifier;
   }
}
