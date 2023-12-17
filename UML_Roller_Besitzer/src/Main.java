public class Main {
    public static void main(String[] args) {
        Roller foo = new Roller(20.00, 10.00, 1254);
        Besitzer bar = new Besitzer("Bar", 2000.0, foo);

        bar.tankeRoller(100.0);
        bar.tankeRoller(5.0);

        bar.fahreRoller(3);
    }
}