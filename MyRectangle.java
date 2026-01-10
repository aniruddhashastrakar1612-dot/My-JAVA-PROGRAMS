import java.util.*;
class Rectangle {
    static float height;
    static float width;
    static void calArea() {
        System.out.println("Area= " + height * width);
    }
}
class MyRectangle {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter height:");
            Rectangle.height = sc.nextFloat();
            System.out.println("Enter width:");
            Rectangle.width = sc.nextFloat();
        }
        Rectangle.calArea();
    }
}