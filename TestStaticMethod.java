class Student {
    int rollno;
    String name;
    static String college = "abc";
    static void change() {
        college = "DIET";
        // cannot access non-static field 'rollno' from static context
    }
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();
        Student s1 = new Student(111, "Tom");
        Student s2 = new Student(222, "Jerry");
        s1.display();
        s2.display();
    }
}