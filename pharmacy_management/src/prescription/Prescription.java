package prescription;

public class Prescription {
    private String prescriptionID; // Unique identifier for each prescription
    private String patientID;      // Unique identifier for the patient
    private String prescribingPhysician; // Doctor's name
    private String prescriptionDate;     // Date of the prescription
    private String medicationID;  // Reference to the prescribed medication
    private int quantityDispensed;       // Amount of medication dispensed
    private String dosageInstructions;   // How the patient should take the medication

    // Updated Constructor (supports the additional required parameters)
    public Prescription(String prescriptionID, String patientID, String medicationID, 
                        String dosageInstructions, int quantityDispensed) {
        this.prescriptionID = prescriptionID;
        this.patientID = patientID;
        this.medicationID = medicationID;
        this.dosageInstructions = dosageInstructions;
        this.quantityDispensed = quantityDispensed;

        // Set optional fields to default values (these can be updated later)
        this.prescribingPhysician = "Unknown";
        this.prescriptionDate = "Unknown";
    }

    // Constructor supporting all attributes
    public Prescription(String prescriptionID, String patientID, String prescribingPhysician, 
                        String prescriptionDate, String medicationID, int quantityDispensed, 
                        String dosageInstructions) {
        this.prescriptionID = prescriptionID;
        this.patientID = patientID;
        this.prescribingPhysician = prescribingPhysician;
        this.prescriptionDate = prescriptionDate;
        this.medicationID = medicationID;
        this.quantityDispensed = quantityDispensed;
        this.dosageInstructions = dosageInstructions;
    }

    // Getters and setters
    public String getPrescriptionID() {
        return prescriptionID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPrescribingPhysician() {
        return prescribingPhysician;
    }

    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    public String getMedicationID() {
        return medicationID;
    }

    public int getQuantityDispensed() {
        return quantityDispensed;
    }

    public String getDosageInstructions() {
        return dosageInstructions;
    }

    // Optional setters (if you need to update prescription details later)
    public void setPrescribingPhysician(String prescribingPhysician) {
        this.prescribingPhysician = prescribingPhysician;
    }

    public void setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }
}
