public abstract class Form2D {
    /**
     * Hier hat "farbe" den Zugriffsmodifikator "protected".
     * Dieser erlaubt den Zugriff auf das Attribut "farbe" nicht nur in der eigenen Klasse,
     * sondern auch in abgeleiteten Klassen.
     * Dies ist wichtig, wenn abgeleitete Klassen (z. B. konkrete Formen wie Kreis oder Rechteck)
     * direkt auf das Attribut zugreifen oder es überschreiben sollen.
     *
     * Da Form2D eine abstrakte, also eine nicht-instanzierbare Klasse ist, ist es sinnvoll, wenn die erbenden
     * Klassen direkt Zugriff auf das Attribut haben.
     *
     * Wäre dieses Attribut "public", könnte es jeder (auch außerhalb der erbenden Klassen) verändern.
     * Wäre es "privat", können es die Unterklassen nur mithilfe von get-/set-Methoden überarbeiten. Dies ist hier
     * nicht sonderlich elegant und auch nicht wirklich nötig, da wir keine zusätzlichen Logiküberprüfungen
     * in den get- und set-Methoden machen.
     *
     * Also ist das Attribut "protected" hier der Zugriffsmodifikator, der verwendet werden soll.
     */
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