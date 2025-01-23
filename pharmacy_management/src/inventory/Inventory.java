package inventory;

public class Inventory {
    private String medicationID; // Unique identifier for the medication
    private int inventoryLevel;  // Current stock level
    private int reorderLevel;    // Minimum stock level before reordering
    private String expirationDate; // Expiration date of the medication
    private String batchNumber;  // Batch or lot number for tracking

    // Constructor
    public Inventory(String medicationID, int inventoryLevel, int reorderLevel,
                     String expirationDate, String batchNumber) {
        this.medicationID = medicationID;
        this.inventoryLevel = inventoryLevel;
        this.reorderLevel = reorderLevel;
        this.expirationDate = expirationDate;
        this.batchNumber = batchNumber;
    }

    // Getters and setters
    public String getMedicationID() {
        return medicationID;
    }

    public int getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getBatchNumber() {
        return batchNumber;
    }
}
