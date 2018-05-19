package se.kth.ict.pos.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Handles the log.
 */
public class LogHandler {
        private PrintWriter fileForLog;
        private static final String NAME_LOG_FILE = "pointofsale-log.txt";
    
   public LogHandler() throws IOException{
    fileForLog = new PrintWriter(new FileWriter(NAME_LOG_FILE),true);
   }
  /**
   * Logs the occured exception in a file.
   * @param exc The exception that is to be logged.
   */
   public void logOccuredException(Exception exc){
       StringBuilder sb = new StringBuilder();
       sb.append("Exception has occured: ");
       sb.append(exc.getMessage());
       fileForLog.println(sb);
       exc.printStackTrace(fileForLog);       
   }
}
