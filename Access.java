// Superclass (renamed to avoid conflicts with other files)
class AAccess {
    int i;              // default access
    private int j;      // private to class AAccess

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    int getJ() {        // getter to access private member
        return j;
    }
}

// Subclass (renamed to avoid conflicts with other files)
class BAccess extends AAccess {
    int k;
    int total;

    void setK(int z) {
        k = z;
    }

    void sum() {
        // total = i + j + k;   // ❌ ERROR: j is private in class AAccess
        total = i + getJ() + k; // ✅ correct way
    }
}

// Main class
public class Access {
    public static void main(String[] args) {
        BAccess subOb = new BAccess();

        subOb.setij(7, 8);
        subOb.setK(9);
        subOb.sum();

        System.out.println("Sum of i, j and k in subOb:");
        System.out.println("i + j + k: " + subOb.total);
    }
}
