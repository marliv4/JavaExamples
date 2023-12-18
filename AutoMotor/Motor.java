public class Motor {
    private String typ;
    private int ps;

    public Motor(String typ, int ps) {
        this.typ = typ;
        this.ps = ps;
    }

    // Getter und Setter für die Attribute
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
