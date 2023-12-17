public class Karte {
    private String wert;
    private String farbe;

    public Karte(String wert, String farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public String getWert() {
        return wert;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}