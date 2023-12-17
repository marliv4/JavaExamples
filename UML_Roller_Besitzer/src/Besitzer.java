public class Besitzer {
    private String name;
    private double geld;
    private Roller meinRoller;

    public Besitzer(String name, double geld, Roller meinRoller) {
        this.name = name;
        this.geld = geld;
        this.meinRoller = meinRoller;
    }

    public String getName()         { return name;          }
    public double getGeld()         { return geld;          }
    public Roller getMeinRoller()   { return meinRoller;    }

    public void tankeRoller(double menge) {
        // Angenommen, ein Liter Benzin kostet 1.60 Euro.
        final var preis = (menge * 1.6); 
        
        if (geld >= preis) {
            if (meinRoller.tanke(menge)) {
                geld -= preis;
                System.out.println(menge + "l getankt.");
            } else {
                System.out.println("Der Tank des Rollers ist voll.");
            }
        } else {
            System.out.println("Nicht genug Geld zum Tanken des Rollers.");
        }
    }

    public void fahreRoller(int strecke) {
        meinRoller.fahre(strecke);
    }

    public void erhalteGeld(double summe) {
        geld += summe;
    }
}