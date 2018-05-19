package se.kth.ict.pos.model;

/**
 * Thrown for simulated database failure in StoreCatalog.
 */
public class StoreCatalogException extends RuntimeException {

    /**
     * Constructor for StoreCatalogException.
     * 
     * @param message Describing error.
     */
    public StoreCatalogException(String message){
        super(message);
    }
}
