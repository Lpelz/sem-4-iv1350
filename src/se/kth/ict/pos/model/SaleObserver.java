package se.kth.ict.pos.model;

/**
 * Interface for SaleObserver
 */
public interface SaleObserver {
    /**
     * Adds revenue amount to observer.
     * @param revenue Amount earned in sale from complete payment.
     */
    public void add(int revenue);
}
