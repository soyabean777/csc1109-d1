package core;

public class Medication {
    private String medicationID;
    private String name;
    private String genericName;
    private String brandName;
    private String dosageForm;
    private String strength;
    private String pharmacistNotes;

    // Constructor
    public Medication(String medicationID, String name, String genericName, String brandName,
                      String dosageForm, String strength, String pharmacistNotes) {
        this.medicationID = medicationID;
        this.name = name;
        this.genericName = genericName;
        this.brandName = brandName;
        this.dosageForm = dosageForm;
        this.strength = strength;
        this.pharmacistNotes = pharmacistNotes;
    }

    // Getters
    public String getMedicationID() {
        return medicationID;
    }

    public String getName() {
        return name;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public String getStrength() {
        return strength;
    }

    public String getPharmacistNotes() {
        return pharmacistNotes;
    }
}
