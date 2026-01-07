class Cube2 {
    double width, height, depth;

    Cube2(double w, double h, double d) {
        System.out.println("Constructing cube");
        width = w;
        height = h;
        depth = d;
    } // cube

    void calVolume() {
        System.out.println("Volume=" + (width * height * depth));
    } // calVolume()
} // class

class MyMain2 {
    public static void main(String[] args) {
        Cube2 c = new Cube2(10, 10, 10);
        c.calVolume();
    }
} 