package supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierManager {
    private List<Supplier> suppliers = new ArrayList<>();

    public void viewSupplierDetails() {
        System.out.println("\n--- Supplier Details ---");
        for (Supplier supplier : suppliers) {
            System.out.println("Supplier Info: " + supplier.getSupplierInfo());
        }
    }
}

