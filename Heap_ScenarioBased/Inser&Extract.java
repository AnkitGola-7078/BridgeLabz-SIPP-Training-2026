import java.util.*;

class Scenario1 {
    static class Patient {
        int severity;
        String name;
        Patient(String n, int s){ name=n; severity=s; }
    }

    PriorityQueue<Patient> triageQueue =
        new PriorityQueue<>((a, b) -> b.severity - a.severity); // max-heap

    void addPatient(Patient p) {
        triageQueue.offer(p); // O(log n)
    }

    Patient treatNext() {
        return triageQueue.poll(); // O(log n)
    }
    public static void main(String[] args) {
        Scenario1 hospital = new Scenario1();
        hospital.addPatient(new Patient("Alice", 5));
        hospital.addPatient(new Patient("Bob", 8));
        hospital.addPatient(new Patient("Charlie", 3));

        System.out.println(hospital.treatNext().name); // Output: Bob
        System.out.println(hospital.treatNext().name); // Output: Alice
        System.out.println(hospital.treatNext().name); // Output: Charlie
    }
}

