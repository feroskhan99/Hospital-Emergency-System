# Hospital-Emergency-System

## Overview
The Hospital Emergency Management System is a Java-based console application designed to manage patients efficiently in a hospital emergency department. It maintains patient records, manages the emergency waiting queue, stores treatment history, and tracks each patient's visit history using appropriate data structures.

## Data Structures Used

| Data Structure | Used For | Why |
|---|---|---|
| Binary Search Tree (BST) | Patient records | Patient ID is used as the key, allowing efficient searching, insertion, and deletion of patient records. |
| Queue | Emergency waiting list | A Queue follows the FIFO (First In, First Out) principle, so patients who arrive first can be treated first. |
| Stack | Treatment history | A Stack follows the LIFO (Last In, First Out) principle, making the most recent treatment record available first. |
| Singly Linked List | Patient visit history | A Linked List allows visit records to be stored dynamically and makes it easy to add new visits without requiring a fixed-size structure. |

## Project Structure
```text
Hospital-Emergency-System/
│
├── src/
│   ├── Main.java
│   ├── model/
│   │   ├── Patient.java
│   │   ├── TreatmentRecord.java
│   │   └── Visit.java
│   └── datastructures/
│       ├── PatientNode.java
│       ├── PatientBST.java
│       ├── QueueNode.java
│       ├── EmergencyQueue.java
│       ├── StackNode.java
│       ├── TreatmentStack.java
│       └── VisitHistory.java
│
└── README.md
```

## Main Components

- **Main.java** – Starts the application and displays the main menu.
- **Patient.java** – Stores patient information such as Patient ID, name, age, contact number, and medical condition.
- **TreatmentRecord.java** – Stores details of a completed treatment.
- **Visit.java** – Stores details of a single hospital visit (visit ID, date, doctor, diagnosis, treatment).
- **PatientBST.java** – Manages patient records using a Binary Search Tree.
- **EmergencyQueue.java** – Maintains the list of patients waiting for emergency treatment.
- **TreatmentStack.java** – Stores treatment records and provides access to the most recent treatment.
- **VisitHistory.java** – Maintains a patient's previous visits using a Singly Linked List.

## How to Run

1. Clone this repository to your computer.
2. Navigate to the `src` folder using the terminal or command prompt.
3. Compile the Java program:
```bash
javac Main.java
```
4. Run the application:
```bash
java Main
```

## Features

- Register new patients and store their records using a Binary Search Tree (BST).
- Search for patients quickly using their unique Patient ID.
- Delete patient records from the Binary Search Tree.
- Add patients to the emergency waiting list using a Queue.
- Remove and process patients from the emergency queue using the FIFO principle.
- Record completed treatments using a Stack.
- View the most recent treatment records using the LIFO principle.
- Add and manage patient visit records using a Singly Linked List.
- View a patient's previous visit history.
- Display patient and emergency management information through a simple console-based menu.

## What I Learned

While completing this assignment, I learned how to implement and use different data structures such as Binary Search Trees, Queues, Stacks, and Singly Linked Lists in Java. I learned how to perform BST insertion, searching, and deletion, including handling the deletion of a node with two children. I also improved my understanding of Java console input handling and learned how to select appropriate data structures based on the requirements of a real-world hospital emergency management system.