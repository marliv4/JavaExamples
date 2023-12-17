public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(1.0, 1.0);
        Kreis k = new Kreis(p1, 1.0, "ROT");
        System.out.println(k.flaeche()); // 3.141592653589793

        Punkt p2 = new Punkt(5.0, 7.0);
        Viereck v = new Viereck(p2, 10.0, "BLAU");
        System.out.println(v.umfang()); // 40.0
    }
}