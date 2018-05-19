package se.kth.ict.pos.controller;

/**
 * Thrown at operation failure, that is without concrete reason.
 */
public class FailedOperationException extends Exception {
    /**
     * Creates instance of the exception with message and occured exception.
     * @param message
     * @param exc 
     */
    public FailedOperationException(String message, Exception exc){
           super(message,exc);       
    }
}
