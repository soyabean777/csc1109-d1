package supplier;

public class Supplier {
    private String supplierInfo; // Details of the supplier
    private double costPrice;    // Cost price of the medication
    private double sellingPrice; // Selling price of the medication

    // Constructor
    public Supplier(String supplierInfo, double costPrice, double sellingPrice) {
        this.supplierInfo = supplierInfo;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    // Getters and setters
    public String getSupplierInfo() {
        return supplierInfo;
    }

    public void setSupplierInfo(String supplierInfo) {
        this.supplierInfo = supplierInfo;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // Method to calculate profit margin
    public double calculateProfitMargin() {
        return sellingPrice - costPrice;
    }
}
