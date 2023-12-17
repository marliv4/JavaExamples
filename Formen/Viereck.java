public class Viereck extends Form2D {
    private Punkt eckeObenLinks;
    private double seitenlaenge;
    public Viereck(Punkt e, double s, String f) {
        super(f);
        eckeObenLinks = e;
        seitenlaenge = s;
    }

    public Punkt getEckeObenLinks() {
        return eckeObenLinks;
    }

    public double getSeitenlaenge() {
        return seitenlaenge;
    }

    public void setEckeObenLinks(Punkt eckeObenLinks) {
        this.eckeObenLinks = eckeObenLinks;
    }

    public void setSeitenlaenge(double seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    public double flaeche() {
        return seitenlaenge * seitenlaenge;
    }

    public double umfang() {
        return 4.0 * seitenlaenge;
    }
}
