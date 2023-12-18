public class Motor {
    private String typ;
    private int ps;

    public Motor(String typ, int ps) {
        this.typ = typ;
        this.ps = ps;
    }

    // Diese get-Methode namens getTyp() gibt das Attribut "typ", welches ein String ist, zurück.
    // Dabei ist sie (sinnvollerweise) public, d.h.
    // außerhalb der Klasse aufrufbar, damit man auf das private Attribut "typ"
    // zugreifen kann.
    public String getTyp() {
        return typ;
    }

    // Diese set-Methode namens setTyp(String typ), welche ein Typ des Motors (die Variable heißt "typ")
    // als String annimmt, setzt das Attribut "typ" auf den als String übergebenen Wert.
    // Dabei ist sie (sinnvollerweise) public, d.h.
    // außerhalb der Klasse aufrufbar, damit man das private Attribut "typ" auf einen bestimmten Wert
    // setzen kann. Dies ist sinnvoll, da die set-Methoden oft weitere Logik überprüfen, damit der übergebene.
    // Wert nicht gesetzt wird, wenn er unpassend ist.
    public void setTyp(String typ) {
        this.typ = typ;
    }

    // Diese get-Methode namens getPs() gibt das Attribut "ps", welches ein int ist, zurück.
    // Dabei ist sie (sinnvollerweise) public, d.h.
    // außerhalb der Klasse aufrufbar, damit man auf das private Attribut "ps"
    // zugreifen kann.
    public int getPs() {
        return ps;
    }

    // Diese set-Methode namens setPs(int ps), welche eine Zahl an Pferdestärken des Motors (die Variable heißt "ps")
    // annimmt, setzt das Attribut "ps" auf den als int übergebenen Wert.
    // Dabei ist sie (sinnvollerweise) public, d.h.
    // außerhalb der Klasse aufrufbar, damit man das private Attribut "ps" auf einen bestimmten Wert
    // setzen kann. Dies ist sinnvoll, da die set-Methoden oft weitere Logik überprüfen, damit der übergebene.
    // Wert nicht gesetzt wird, wenn er unpassend ist.
    public void setPs(int ps) {
        this.ps = ps;
    }
}
