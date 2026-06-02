package Assignment_4;

import java.util.Scanner;
abstract class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void displayDetails();
}
class Patient extends Person {
    private int patientId;
    public Patient(int patientId, String name, int age) {
        super(name, age);
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
    }
}

class Doctor extends Person {
    private final String specialization;
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}
interface Service{
    void serviceDetails();
}
class Pharmacy implements Service {
    private double medicineBill;
    public Pharmacy(double medicineBill) {
        this.medicineBill = medicineBill;
    }

    @Override
    public void serviceDetails() {
        System.out.println("Medicine Bill: " + medicineBill);
    }
}
class LabTest implements Service {
    private String testName;
    public LabTest(String testName) {
        this.testName = testName;
    }

    @Override
    public void serviceDetails() {
        System.out.println("Lab Test Booked: " + testName);
    }
}
class Appointment {

    public void bookAppointment() {
        System.out.println("Appointment Booked Successfully");
    }
    public void consultationStatus() {
        System.out.println("Consultation Completed Successfully");
    }
}
class Billing {

    // Method Overloading
    public double generateBill(double consultationFee) {
        return consultationFee;
    }
    public double generateBill(double consultationFee, double medicineBill) {
        return consultationFee + medicineBill;
    }
    public double generateBill(double consultationFee, double medicineBill, double labFee) {
        return consultationFee + medicineBill + labFee;
    }
}

public class HospitalManagementSystem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Patient patient = null;
        Doctor doctor = null;

        int choice;
        do{
            System.out.println("=====HOSPITAL MANAGEMENT SYSTEM=====");
            System.out.println("1.Add Patient");
            System.out.println("2.View Patient");
            System.out.println("3.Add Doctor");
            System.out.println("4.View Doctor");
            System.out.println("5.Book Appointment");
            System.out.println("6.Generate Bill");
            System.out.println("7.Consultation status");
            System.out.println("8.Pharmacy Service");
            System.out.println("9.Lab Test Service");
            System.out.println("10.Exit");


            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Patient ID: ");
                    int patientId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int patientAge = sc.nextInt();
                    patient = new Patient(patientId, patientName, patientAge);
                    System.out.println("Patient Added Successfully");
                    break;

                case 2:
                    if (patient != null) {
                        patient.displayDetails();
                    } else {
                        System.out.println("No Patient Found");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();
                    System.out.print("Enter Doctor Age: ");
                    int doctorAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();
                    doctor = new Doctor(doctorName, doctorAge, specialization);
                    System.out.println("Doctor Added Successfully");
                    break;

                case 4:

                    if (doctor != null) {
                        doctor.displayDetails();
                    } else {
                        System.out.println("No Doctor Found");
                    }
                    break;

                case 5:
                    Appointment appointment = new Appointment();
                    appointment.bookAppointment();
                    break;

                case 6:
                    Billing billing = new Billing();
                    System.out.print("Enter Consultation Fee: ");
                    double consultationFee = sc.nextDouble();
                    System.out.print("Enter Medicine Bill: ");
                    double medicineBill = sc.nextDouble();
                    System.out.print("Enter Lab Fee: ");
                    double labFee = sc.nextDouble();
                    double totalBill = billing.generateBill(consultationFee, medicineBill, labFee);
                    System.out.println("Total Hospital Bill: " + totalBill);
                    break;

                case 7:
                    Appointment consultation = new Appointment();
                    consultation.consultationStatus();
                    break;

                case 8:

                    System.out.print("Enter Medicine Bill Amount: ");
                    double medicineAmount = sc.nextDouble();
                    Pharmacy pharmacy = new Pharmacy(medicineAmount);
                    pharmacy.serviceDetails();
                    break;

                case 9:

                    sc.nextLine();
                    System.out.print("Enter Lab Test Name: ");
                    String testName = sc.nextLine();
                    LabTest labTest = new LabTest(testName);
                    labTest.serviceDetails();
                    break;

                case 10:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 10);

        sc.close();
    }
}


