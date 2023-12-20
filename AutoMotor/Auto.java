/*
 * Beschreibung der Klasse Auto

 * Die Klasse hat drei private Attribute:
 *  -  marke: Ein String, der die Marke des Autos repräsentiert
 *  -  baujahr: Ein Integer, der das Baujahr des Autos repräsentiert
 *  -  motor: Ein Objekt der Klasse Motor, das den Motor des Autos repräsentiert

*
* Konstruktor: Der Konstruktor der Klasse nimmt vier Parameter: marke, baujahr, motorTyp und ps.
* Die ersten beiden Parameter werden verwendet, um die entsprechenden Attribute der Klasse zu initialisieren.
* Die letzten beiden Parameter werden verwendet, um ein neues Motor-Objekt zu erstellen.
* Damit wird die Komposition gewährleistet: Es werden Attribute für den Konstruktor des Motors übergeben,
* nicht ein Objekt vom Motor (wie es z.B. bei der Aggregation der Fall ist).

* Getter und Setter: Für jedes Attribut gibt es eine get- und eine set-Methode.
* Die get-Methode gibt den Wert des Attributs zurück, während die set-Methode den Wert des Attributs setzt.
* Dabei ist jede get-/set-Methode mit dem Zugriffsmodifikator "public" versehen, d.h. diese Methoden können von außerhalb
* der Klasse aufgerufen werden.
*
* Zu den get-Methoden zählen hier:
*   - getMarke(), welche einen String, bzw. das Attribut "marke" zurückgibt
*   - getBaujahr(), welche einen int, bzw. das Attribut "baujahr" zurückgibt
*   - getMotor(), welche eine Instanz der Klasse "Motor", bzw. das Attribut "motor" zurückgibt
*
* Zu den set-Methoden zählen hier:
*   - setMarke(String marke), welche einen String annimmt und diesen dem Attribut "marke" zuweist.
*   - setBaujahr(int baujahr), welche einen int annimmt und diesen dem Attribut "baujahr" zuweist.

* Die Auto-Klasse repräsentiert also ein Auto mit einer Marke, einem Baujahr und einem Motor.
* Der Motor ist dabei ein Objekt, das nur innerhalb des Auto-Objekts existiert.
* Dies ist ein Beispiel für Komposition in der objektorientierten Programmierung.
*/
public class Auto {
    private String marke;
    private int baujahr;
    private Motor motor;

    public Auto(String marke, int baujahr, String motorTyp, int ps) {
        this.marke = marke;
        this.baujahr = baujahr;

        /*
         * In diesem Fall habe ich mich für die Klassenbeziehung "Komposition" entschieden. Eine Aggregation ginge auch.
         * Allerdings ist die Frage: ist ein Auto immer noch ein Auto, wenn ihm das Motor entzogen wird?
         
         * Duden definiert ein Auto als (https://www.duden.de/rechtschreibung/Auto_Fahrzeug):
         * 
         * "durch einen Motor angetriebenes Straßenfahrzeug mit gummibereiften Rädern und offener oder geschlossener Karosserie zum **Transport** von 
         * Personen oder Gütern; Kraftwagen, Kraftfahrzeug, Automobil"
         * 
         * Da ein Auto beim Entzug des Motors seinen grundlegenden Sinn, welcher darin besteht, Personen zu transportieren, verliert, habe ich mich hier für die 
         * Komposition entschieden. Ein Auto ohne Motor ist für mich nur ein "Käfig" aus Metall.
         * Außerdem: Wenn ein Auto komplett abbrennt, brennt sein Motor damit auch ab.
         * 
         * Deshalb bin ich der Meinung, dass hier die Komposition angebrachter ist als die Aggregation. Diese würde aber,
         * was die Implementation angeht, natürlich auch funktionieren.
         */
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

    public void fahre(int strecke) {
        // ...
    }

}