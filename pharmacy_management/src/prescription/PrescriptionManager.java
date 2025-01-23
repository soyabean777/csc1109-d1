package prescription;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import core.MedicationManager; // Import MedicationManager to use it here

public class PrescriptionManager {
    private List<Prescription> prescriptions = new ArrayList<>();

    public void addPrescription(Scanner scanner, MedicationManager medicationManager) {
        System.out.print("Enter Prescription ID: ");
        String prescriptionID = scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientID = scanner.nextLine();
        System.out.print("Enter Medication ID: ");
        String medicationID = scanner.nextLine();

        // Check if the medication exists in the MedicationManager
        if (medicationManager.findMedicationById(medicationID) == null) {
            System.out.println("Error: Medication ID not found.");
            return;
        }

        System.out.print("Enter Dosage Instructions: ");
        String dosageInstructions = scanner.nextLine();
        System.out.print("Enter Quantity Dispensed: ");
        int quantityDispensed = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        prescriptions.add(new Prescription(prescriptionID, patientID, medicationID, dosageInstructions, quantityDispensed));
        System.out.println("Prescription added successfully!");
    }

    public void viewPrescriptions() {
        System.out.println("\n--- List of Prescriptions ---");
        for (Prescription prescription : prescriptions) {
            System.out.println("Prescription ID: " + prescription.getPrescriptionID()
                               + ", Patient ID: " + prescription.getPatientID()
                               + ", Medication ID: " + prescription.getMedicationID());
        }
    }
}
