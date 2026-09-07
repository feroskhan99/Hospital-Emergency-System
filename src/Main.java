import java.util.Scanner;
import model.Patient;
import model.TreatmentRecord;
import model.Visit;
import datastructures.PatientBST;
import datastructures.EmergencyQueue;
import datastructures.TreatmentStack;
import datastructures.VisitHistory;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentStack = new TreatmentStack();

        int choice;

        do {
            System.out.println("\n===== Hospital Emergency Management System =====");
            System.out.println("1. Register new patient (BST)");
            System.out.println("2. Search patient by ID (BST)");
            System.out.println("3. Delete patient (BST)");
            System.out.println("4. Display all patients (in-order)");
            System.out.println("5. Add patient to emergency queue");
            System.out.println("6. Treat next patient (dequeue)");
            System.out.println("7. Display waiting queue");
            System.out.println("8. Complete treatment (push to stack)");
            System.out.println("9. Display treatment history (stack)");
            System.out.println("10. Add visit to patient history");
            System.out.println("11. Display patient visit history");
            System.out.println("12. Search visit by ID");
            System.out.println("13. Remove visit from history");
            System.out.println("0. Exit");

        if (choice == 1) {
    System.out.print("Enter Patient ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Patient Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Contact Number: ");
    String contact = sc.nextLine();

    System.out.print("Enter Medical Condition: ");
    String condition = sc.nextLine();

    Patient newPatient = new Patient(id, name, age, contact, condition);
    patientBST.insert(newPatient);
    System.out.println("Patient registered successfully.");
}
else if (choice == 2) {
    System.out.print("Enter Patient ID to search: ");
    int searchId = sc.nextInt();

    Patient found = patientBST.search(searchId);
    if (found != null) {
        found.displayDetails();
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 3) {
    System.out.print("Enter Patient ID to delete: ");
    int deleteId = sc.nextInt();

    boolean deleted = patientBST.delete(deleteId);
    if (deleted) {
        System.out.println("Patient deleted successfully.");
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 4) {
    patientBST.inOrderTraversal();
}
else if (choice == 5) {
    System.out.print("Enter Patient ID to add to queue: ");
    int qid = sc.nextInt();

    Patient p = patientBST.search(qid);
    if (p != null) {
        emergencyQueue.enqueue(p);
        System.out.println("Patient added to emergency queue.");
    } else {
        System.out.println("Patient not found in records. Please register first.");
    }
}
else if (choice == 6) {
    Patient treated = emergencyQueue.dequeue();
    if (treated != null) {
        System.out.println("Now treating:");
        treated.displayDetails();
    }
}
else if (choice == 7) {
    emergencyQueue.displayQueue();
}
else if (choice == 8) {
    System.out.print("Enter Patient ID: ");
    int tid = sc.nextInt();
    sc.nextLine();

    Patient p = patientBST.search(tid);
    if (p != null) {
        System.out.print("Enter treatment details: ");
        String details = sc.nextLine();

        TreatmentRecord record = new TreatmentRecord(p.getPatientId(), p.getName(), details);
        treatmentStack.push(record);
        System.out.println("Treatment record saved.");
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 9) {
    treatmentStack.displayStack();
}

else if (choice == 10) {
    System.out.print("Enter Patient ID: ");
    int pid = sc.nextInt();
    sc.nextLine();

    Patient p = patientBST.search(pid);
    if (p != null) {
        System.out.print("Enter Visit ID: ");
        int vid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Visit Date: ");
        String date = sc.nextLine();
        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis = sc.nextLine();
        System.out.print("Enter Treatment: ");
        String treatment = sc.nextLine();

        Visit newVisit = new Visit(vid, date, doctor, diagnosis, treatment);
        p.getVisitHistory().addVisit(newVisit);
        System.out.println("Visit added to patient history.");
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 11) {
    System.out.print("Enter Patient ID: ");
    int pid = sc.nextInt();

    Patient p = patientBST.search(pid);
    if (p != null) {
        p.getVisitHistory().displayHistory();
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 12) {
    System.out.print("Enter Patient ID: ");
    int pid = sc.nextInt();

    Patient p = patientBST.search(pid);
    if (p != null) {
        System.out.print("Enter Visit ID to search: ");
        int vid = sc.nextInt();
        Visit v = p.getVisitHistory().searchVisit(vid);
        if (v != null) {
            v.displayDetails();
        } else {
            System.out.println("Visit not found.");
        }
    } else {
        System.out.println("Patient not found.");
    }
}
else if (choice == 13) {
    System.out.print("Enter Patient ID: ");
    int pid = sc.nextInt();

    Patient p = patientBST.search(pid);
    if (p != null) {
        System.out.print("Enter Visit ID to remove: ");
        int vid = sc.nextInt();
        boolean removed = p.getVisitHistory().removeVisit(vid);
        if (removed) {
            System.out.println("Visit removed.");
        } else {
            System.out.println("Visit not found.");
        }
    } else {
        System.out.println("Patient not found.");
    }
}
        } while (choice != 0);

        sc.close();
        System.out.println("System closed.");
    }

}