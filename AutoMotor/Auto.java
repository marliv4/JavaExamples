public class Auto {
    private String marke;
    private int baujahr;
    private Motor motor;

    public Auto(String marke, int baujahr, String motorTyp, int ps) {
        this.marke = marke;
        this.baujahr = baujahr;

        // Komposition
        motor = new Motor(motorTyp, ps);
    }

    // Getter und Setter für die Attribute
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public Motor getMotor() {
        return motor;
    }

}