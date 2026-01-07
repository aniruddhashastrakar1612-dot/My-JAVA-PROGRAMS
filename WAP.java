class PersonInfo {
    String name;
    int age;
}
class WAPMain {
    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo();
        PersonInfo p2 = new PersonInfo();
        p1.name = "modi";
        p1.age = 71;
        p2.name = "Bachchan";
        p2.age = 80;
        System.out.println("p1.name=" + p1.name);
        System.out.println("p2.name=" + p2.name);
        System.out.println("p1.age=" + p1.age);
        System.out.println("p2.age=" + p2.age);
    }
} 