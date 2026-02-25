import java.util.Scanner;

// Car class
class Car {
    String make;
    String model;
    int year;

    // Default Constructor
    Car() {
        make = "Unknown Make";
        model = "Unknown Model";
        year = 0;
    }

    // Parameterized Constructor
    Car(String make, String model, int year) {

        if ((make == null) || make.equals("") || 
            make.equalsIgnoreCase("empty") || 
            make.equalsIgnoreCase("null")) {
            this.make = "Unknown Make";
        } else {
            this.make = make;
        }

        if ((model == null) || model.equals("") || 
            model.equalsIgnoreCase("empty") || 
            model.equalsIgnoreCase("null")) {
            this.model = "Unknown Model";
        } else {
            this.model = model;
        }

        if (year < 0) {
            System.out.println("Invalid year! Year cannot be negative");
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    // Display method
    void display() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

// Main class
public class Practical2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for parameterized constructor
        String make = sc.nextLine();
        String model = sc.nextLine();
        int year = sc.nextInt();

        // Object using default constructor
        Car car1 = new Car();

        // Object using parameterized constructor
        Car car2 = new Car(make, model, year);

        car1.display();
        car2.display();

        sc.close();
    }
}