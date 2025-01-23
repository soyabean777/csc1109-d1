package cli;

import java.util.Scanner;
import core.MedicationManager;
import prescription.PrescriptionManager;
import inventory.InventoryManager;
import supplier.SupplierManager;


public class PharmacyManagementCLI {
	
    private MedicationManager medicationManager = new MedicationManager();
    private PrescriptionManager prescriptionManager = new PrescriptionManager();
    private InventoryManager inventoryManager = new InventoryManager();
    private SupplierManager supplierManager = new SupplierManager();

    public static void main(String[] args) {
        PharmacyManagementCLI app = new PharmacyManagementCLI();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Pharmacy Management System ---");
            System.out.println("1. Medication Module");
            System.out.println("2. Prescription Module");
            System.out.println("3. Inventory Module");
            System.out.println("4. Supplier Module");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    medicationMenu(scanner);
                    break;
                case 2:
                    prescriptionMenu(scanner);
                    break;
                case 3:
                    inventoryMenu(scanner);
                    break;
                case 4:
                    supplierMenu(scanner);
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private void medicationMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Medication Module ---");
            System.out.println("1. Add Medication");
            System.out.println("2. View Medications");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    medicationManager.addMedication(scanner);
                    break;
                case 2:
                    medicationManager.viewMedications();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }

    private void prescriptionMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Prescription Module ---");
            System.out.println("1. Add Prescription");
            System.out.println("2. View Prescriptions");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    prescriptionManager.addPrescription(scanner, medicationManager);
                    break;
                case 2:
                    prescriptionManager.viewPrescriptions();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }

    private void inventoryMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Inventory Module ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    inventoryManager.viewInventory();
                    break;
                case 2:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 2);
    }

    private void supplierMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Supplier Module ---");
            System.out.println("1. View Supplier Details");
            System.out.println("2. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    supplierManager.viewSupplierDetails();
                    break;
                case 2:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 2);
    }
}
