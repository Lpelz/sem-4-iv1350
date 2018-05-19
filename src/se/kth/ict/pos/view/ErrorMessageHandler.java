package se.kth.ict.pos.view;

/**
 * Class that handles display of error messages to user of program.
 */
class ErrorMessageHandler {
    
    /**
     * Displays the error message given as argument.
     */
    void displayErrorMessage(String message){
        StringBuilder sb = new StringBuilder();
        sb.append("ERROR OCCURED: ");
        sb.append(message);
        System.out.println(sb);        
    }
}
