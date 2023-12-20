class Adresse {
    private String strasse;
    private String stadt;
    private String postleitzahl;

    public Adresse(String strasse, String stadt, String postleitzahl) {
        this.strasse = strasse;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String toString() {
        return strasse + ", " + postleitzahl + " " + stadt;
    }
}

public class Person {
    private String name;

    /**
     * In dieser Klasse (Person) gibt es das private Attribut "adresse", das vom Typ Adresse ist.
     * Diese Referenz auf ein Adresse-Objekt repräsentiert die Assoziation zwischen Person und Adresse.
     * Durch dieses Attribut können Objekte der Klasse Person mit Objekten der Klasse Adresse in Verbindung
     * gebracht werden. Der Zugriff auf das Adresse-Objekt erfolgt über die get-/set-Methode.
     *
     * Die Klasse Person **hat** also eine Adresse und damit liegt eine Assoziation vor.
     * in Java unterscheidet sich die Assoziation, was die Implementation angeht, nicht allzu sehr von der Aggregation
     * (diese haben wir normalerweise bei Listen/Feldern von Objekten, die Attribut einer Klasse waren,
     * als Klassenbeziehung angegeben). In anderen Sprachen würde man die Assoziation bspw. mit Zeigern implementieren,
     * was für eine bessere Unterscheidung zwischen der Assoziation und Aggregation sorgt.
     *
     * Also habe ich anhand eines vom KI generierten Quelltext nachgewiesen, dass die Assoziation vorliegt. Bei
     * fehlender Assoziation wäre eine Adresse kein Attribut der Klasse "Person".
     */
    private Adresse adresse; // Assoziation zur Adresse

    public Person(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return name + " wohnt in: " + adresse.toString();
    }

    public static void main(String[] args) {
        Adresse adresse = new Adresse("Musterstraße 123", "Musterstadt", "12345");
        Person person = new Person("Max Mustermann", adresse);

        System.out.println(person.toString());
    }
}
