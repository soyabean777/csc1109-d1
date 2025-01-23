package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicationManager {
    private List<Medication> medications = new ArrayList<>();

    // Method to add a new medication
    public void addMedication(Scanner scanner) {
        System.out.print("Enter Medication ID: ");
        String medicationID = scanner.nextLine();
        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Generic Name: ");
        String genericName = scanner.nextLine();
        System.out.print("Enter Brand Name: ");
        String brandName = scanner.nextLine();
        System.out.print("Enter Dosage Form: ");
        String dosageForm = scanner.nextLine();
        System.out.print("Enter Strength: ");
        String strength = scanner.nextLine();
        System.out.print("Enter Pharmacist Notes: ");
        String pharmacistNotes = scanner.nextLine();

        // Create and add Medication object with all attributes
        medications.add(new Medication(medicationID, name, genericName, brandName, dosageForm, strength, pharmacistNotes));

        System.out.println("Medication added successfully!");
    }

    // Method to view all medications
    public void viewMedications() {
        System.out.println("\n--- List of Medications ---");
        for (Medication medication : medications) {
            System.out.println(
                "ID: " + medication.getMedicationID() +
                ", Name: " + medication.getName() +
                ", Generic Name: " + medication.getGenericName() +
                ", Brand Name: " + medication.getBrandName() +
                ", Dosage Form: " + medication.getDosageForm() +
                ", Strength: " + medication.getStrength() +
                ", Notes: " + medication.getPharmacistNotes()
            );
        }
    }

    // Method to find a medication by ID
    public Medication findMedicationById(String medicationID) {
        for (Medication medication : medications) {
            if (medication.getMedicationID().equals(medicationID)) {
                return medication; // Return the matching medication object
            }
        }
        return null; // Return null if no medication matches the given ID
    }
}
