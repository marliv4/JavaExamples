public class Kreis extends Form2D {
    private Punkt mittelpunkt;
    private double radius;

    public Kreis(Punkt m, double r, String f) {
        super(f);
        mittelpunkt = m;
        radius = r;
    }

    public void skalieren(double faktor) {
        if (faktor > 0) {
            radius *= faktor;
            mittelpunkt.setX(mittelpunkt.getX() * faktor);
            mittelpunkt.setY(mittelpunkt.getY() * faktor);
        } else {
            System.out.println("Ungültiger Skalierungsfaktor. Der Skalierungsfaktor muss größer als 0 sein.");
        }
    }

    public double umfang() {
        return 2.0 * Math.PI * radius;
    }
    public double flaeche() {
        return Math.PI * (radius * radius);
    }
}