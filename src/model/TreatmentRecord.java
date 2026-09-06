package model;

public class TreatmentRecord {

    private int patientId;
    private String patientName;
    private String treatmentDetails;

    public TreatmentRecord(int patientId, String patientName, String treatmentDetails) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentDetails = treatmentDetails;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Treatment: " + treatmentDetails);
        System.out.println("-----------------------------");
    }

}
