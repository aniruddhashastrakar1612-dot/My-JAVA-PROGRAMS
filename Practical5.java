import java.util.Scanner;

// Abstract class
abstract class Instrument {
    abstract void play();
    abstract void tune();
}

// Glockenspiel class
class Glockenspiel extends Instrument {

    void play() {
        System.out.println("Playing Glockenspiel");
    }

    void tune() {
        System.out.println("Tuning Glockenspiel");
    }
}

// Violin class
class Violin extends Instrument {

    void play() {
        System.out.println("Playing Violin");
    }

    void tune() {
        System.out.println("Tuning Violin");
    }
}

// Main class
public class Practical5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim().toLowerCase();
        Instrument instrument;

        if (input.equals("glockenspiel")) {
            instrument = new Glockenspiel();
        } else {
            instrument = new Violin();
        }

        instrument.play();
        instrument.tune();

        sc.close();
    }
}