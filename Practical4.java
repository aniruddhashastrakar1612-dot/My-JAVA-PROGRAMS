import java.util.Scanner;

// Type Content here...
interface Work {
    String getJobRole();
}

class Person4 {
    String name;

    Person4(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Employee4 extends Person4 implements Work {
    String role;

    Employee4(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getJobRole() {
        return role;
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String role = sc.nextLine();

        Employee4 emp = new Employee4(name, role);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Job Role: " + emp.getJobRole());

        sc.close();
    }
}
