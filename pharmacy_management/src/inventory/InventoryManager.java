package inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Inventory> inventoryList = new ArrayList<>();

    public void viewInventory() {
        System.out.println("\n--- Inventory ---");
        for (Inventory inventory : inventoryList) {
            System.out.println("Medication ID: " + inventory.getMedicationID()
                               + ", Stock Level: " + inventory.getInventoryLevel());
        }
    }
}
