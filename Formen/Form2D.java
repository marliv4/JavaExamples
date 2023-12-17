public abstract class Form2D {
    protected String farbe;

    public Form2D(String f) {
        farbe = f;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public abstract double umfang();
    public abstract double flaeche();
}