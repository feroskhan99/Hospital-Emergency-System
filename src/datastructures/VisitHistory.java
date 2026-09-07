package datastructures;

import model.Visit;

public class VisitHistory {

    private Visit first;

    public VisitHistory() {
        first = null;
    }

    public void addVisit(Visit newVisit) {
        newVisit.next = first;
        first = newVisit;
    }
    public void displayHistory() {
        if (first == null) {
            System.out.println("No visit history available.");
            return;
        }
    
        System.out.println("Visit History:");
        Visit current = first;
        while (current != null) {
            current.displayDetails();
            current = current.next;
        }
    }
    public Visit searchVisit(int visitId) {
        Visit current = first;
    
        while (current != null) {
            if (current.getVisitId() == visitId) {
                return current;
            }
            current = current.next;
        }
    
        return null;   // not found
    }
    public boolean removeVisit(int visitId) {
        Visit current = first;
        Visit previous = first;
    
        while (current != null) {
            if (current.getVisitId() == visitId) {
                if (current == first) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
    
        return false;   // not found
    }
}
