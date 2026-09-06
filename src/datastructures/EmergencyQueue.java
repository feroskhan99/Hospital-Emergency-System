package datastructures;

import model.Patient;

public class EmergencyQueue {

    private QueueNode front;
    private QueueNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }
    
    public void enqueue(Patient patient) {
        QueueNode newNode = new QueueNode(patient);
    
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patient waiting.");
            return null;
        }
    
        Patient removedPatient = front.patient;
        front = front.next;
    
        if (front == null) {
            rear = null;   // queue became empty
        }
    
        return removedPatient;
    }
}public void displayQueue() {
    if (isEmpty()) {
        System.out.println("Queue is empty. No patients waiting.");
        return;
    }

    System.out.println("Patients currently waiting:");
    QueueNode current = front;
    while (current != null) {
        current.patient.displayDetails();
        current = current.next;
    }
}public void displayQueue() {
    if (isEmpty()) {
        System.out.println("Queue is empty. No patients waiting.");
        return;
    }

    System.out.println("Patients currently waiting:");
    QueueNode current = front;
    while (current != null) {
        current.patient.displayDetails();
        current = current.next;
    }
}
public void displayQueue() {
    if (isEmpty()) {
        System.out.println("Queue is empty. No patients waiting.");
        return;
    }

    System.out.println("Patients currently waiting:");
    QueueNode current = front;
    while (current != null) {
        current.patient.displayDetails();
        current = current.next;
    }
}
