import java.util.Scanner;

// Type Content here...
class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

class Employee extends Person {
    String employeeId;
    String jobTitle;

    Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return this.employeeId;
    }

    String getLastName() {
        return this.lastName + " (" + this.jobTitle + ")";
    }
}

public class Practical3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input format (for testing ease)
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String empId = sc.nextLine();
        String title = sc.nextLine();

        Employee emp = new Employee(firstName, lastName, empId, title);

        // Output
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());

        sc.close();
    }
}
