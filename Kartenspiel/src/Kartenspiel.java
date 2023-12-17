import java.util.Random;

public class Kartenspiel {
    private Karte[] karten;
    private final String[] werte = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König"};
    private final String[] farben = {"Rot", "Blau", "Grün", "Gelb"};

    public Kartenspiel() {
        /**
         * Q1.3-26-83: Ich kann beurteilen, ob ein Feld von Objekten in einem Programm vorteilhaft ist oder nicht.
         *
         * Vorteile eines Felds von Objekten:
         * 1. Effizienter Speicherzugriff über den Index (O(1)).
         * 2. Feste Größe, was die Performance verbessert.
         * 3. Einfache Iteration: Einfaches Durchlaufen der Datenstruktur mit einer Laufzeit von O(n).
         *
         * Nachteile eines Felds von Objekten:
         * 1. Feste Größe, nicht geeignet für dynamisch wachsende oder schrumpfende Datenmengen.
         * 2. Keine dynamische Größenanpassung, fehlende Funktionalität zur automatischen Größenanpassung.
         * 3. Keine eingebaute Funktionalität für Operationen (d.h. begrenzte Operationen im Vergleich zu anderen
         * Datenstrukturen.)
         *
         * Die Entscheidung für oder gegen ein Feld von Objekten hängt von den spezifischen Anforderungen des Programms ab.
         * Bei statischer Größe und häufigen Zugriffen kann ein Feld vorteilhaft sein, während für dynamische Größenanpassung
         * oder komplexe Operationen andere Datenstrukturen wie ArrayLists in Betracht gezogen werden sollten.
         *
         * Hier ist ein Feld von Objekten zweifellos sinnvoll und vorteilhaft, da es in einem Kartenspiel eine feste Größe an Karten
         * gibt. Es kommen keine neuen Karten dazu.
         */
        karten = new Karte[52];
        initializeDeck();
    }

    public void printKarten() {
        for (int i = 0; i < karten.length; i++) {
            System.out.printf("%22s: %22s", karten[i].getWert(), karten[i].getFarbe());
            System.out.println();
        }
        System.out.println();
    }

    private void initializeDeck() {
        int index = 0;
        for (String farbe : farben) {
            for (String wert : werte) {
                karten[index] = new Karte(wert, farbe);
                index++;
            }
        }
    }

    public void mischen() {
        Random rand = new Random();
        for (int i = karten.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            Karte temp = karten[i];
            karten[i] = karten[j];
            karten[j] = temp;
        }
    }
}
