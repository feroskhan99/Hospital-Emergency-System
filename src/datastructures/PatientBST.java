package datastructures;

import model.Patient;

public class PatientBST {

    private PatientNode root;

    public PatientBST() {
        root = null;
    }

    public void insert(Patient patient) {
        PatientNode newNode = new PatientNode(patient);
    
        if (root == null) {
            root = newNode;
            return;
        }
    
        PatientNode current = root;
        PatientNode parent;
    
        while (true) {
            parent = current;
            if (patient.getPatientId() < current.patient.getPatientId()) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }
    
    private void inOrderTraversal(PatientNode current) {
        if (current != null) {
            inOrderTraversal(current.left);
            current.patient.displayDetails();
            inOrderTraversal(current.right);
        }
    }
    public Patient search(int patientId) {
        PatientNode current = root;
    
        while (current != null) {
            if (patientId == current.patient.getPatientId()) {
                return current.patient;   // found it
            } else if (patientId < current.patient.getPatientId()) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    
        return null;   // not found
    }
}Patient p = bst.search(101);
if (p != null) {
    p.displayDetails();
} else {
    System.out.println("Patient not found.");
    public boolean delete(int patientId) {
        PatientNode current = root;
        PatientNode parent = root;
        boolean isLeftChild = false;
    
        // Step 1: find the node to delete
        while (current.patient.getPatientId() != patientId) {
            parent = current;
            if (patientId < current.patient.getPatientId()) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;   // not found
            }
        }
    
        // Step 2: Case 1 - node has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Step 3: Case 2 - node has only one child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Step 4: Case 3 - node has two children
        else {
            PatientNode successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    
        return true;
    }
}
