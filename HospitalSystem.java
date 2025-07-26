import java.util.Scanner;

// Doctor class
class Doctor {
    String name;
    String id;
    String specialization;
    String contact;

    void input(Scanner sc) {
        System.out.println("Enter Doctor's Name:");
        name = sc.nextLine();
        System.out.println("Enter Doctor's ID:");
        id = sc.nextLine();
        System.out.println("Enter Specialization:");
        specialization = sc.nextLine();
        System.out.println("Enter Contact Number:");
        contact = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Doctor Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Specialization: " + specialization);
        System.out.println("Contact: " + contact);
    }
}

// Nurse class
class Nurse {
    String name;
    String id;
    String ward;
    String contact;

    void input(Scanner sc) {
        System.out.println("Enter Nurse's Name:");
        name = sc.nextLine();
        System.out.println("Enter Nurse's ID:");
        id = sc.nextLine();
        System.out.println("Enter Assigned Ward:");
        ward = sc.nextLine();
        System.out.println("Enter Contact Number:");
        contact = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Nurse Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Ward: " + ward);
        System.out.println("Contact: " + contact);
    }
}

// Patient class
class Patient {
    String name;
    String id;
    String disease;
    String contact;

    void input(Scanner sc) {
        System.out.println("Enter Patient's Name:");
        name = sc.nextLine();
        System.out.println("Enter Patient's ID:");
        id = sc.nextLine();
        System.out.println("Enter Disease:");
        disease = sc.nextLine();
        System.out.println("Enter Contact Number:");
        contact = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Disease: " + disease);
        System.out.println("Contact: " + contact);
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Doctor doc = new Doctor();
        Nurse nurse = new Nurse();
        Patient patient = new Patient();

        System.out.println("Enter Doctor Details:");
        doc.input(sc);

        System.out.println("\nEnter Nurse Details:");
        nurse.input(sc);

        System.out.println("\nEnter Patient Details:");
        patient.input(sc);

        // Display all details
        doc.display();
        nurse.display();
        patient.display();

        sc.close();
    }
}
