package datastructures;

import model.TreatmentRecord;

public class StackNode {

    public TreatmentRecord record;
    public StackNode next;

    public StackNode(TreatmentRecord record) {
        this.record = record;
        this.next = null;
    }

}
