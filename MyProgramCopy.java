class Student{
String name;
 int rollno;
 Student(String s_name, int s_roll){

this.name=s_name;
this.rollno=s_roll;
} //Constructor1


Student(Student s){ //CopyConstructor
System.out.println("CopyConstructor Invoked");

this.name=s.name;
this.rollno=s.rollno;
} //Constructor2
public void display() {
    System.out.println("name=" + name);
    System.out.println("rollno=" + rollno);
} // display()
} // class Student

class MyProgramCopy {
    public static void main(String[] args) {
        Student s1 = new Student("darshan", 101);
        // invoking Copy Constructor
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    } // main()
} // class MyProgramCopy