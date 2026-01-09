class StaticDemo {
    static int a = 4;
    static int b;
    static void dispValue(int x) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println("inside main()...");
        dispValue(44);
    }
}
