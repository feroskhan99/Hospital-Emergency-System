package datastructures;

import model.TreatmentRecord;

public class TreatmentStack {

    private StackNode top;

    public TreatmentStack() {
        top = null;
    }

    public TreatmentRecord pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No treatment records.");
            return null;
        }
    
        TreatmentRecord removedRecord = top.record;
        top = top.next;
        return removedRecord;
    }
    public boolean isEmpty() {
        return (top == null);
    }
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No treatment records.");
            return;
        }
    
        System.out.println("Treatment records (most recent first):");
        StackNode current = top;
        while (current != null) {
            current.record.displayDetails();
            current = current.next;
        }
    }
}
