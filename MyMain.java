class Cube {
    double width, height, depth;

    Cube(double w, double h, double d) {
        System.out.println("Constructing cube");
        width = w;
        height = h;
        depth = d;
    } // cube

    void calVolume() {
        System.out.println("Volume=" + (width * height * depth));
    } // calVolume()
} // class

class MyMain {
    public static void main(String[] args) {
        Cube c = new Cube(10, 10, 10);
        c.calVolume();
    }
}