public class Roller {
    private double tankgroesse;
    private double tankinhalt;
    private int kilometerstand;

    public Roller(double tankgroesse, double tankinhalt, int kilometer) {
        this.tankgroesse = tankgroesse;
        this.tankinhalt = tankinhalt;
        kilometerstand = kilometer;
    }

    public double getTankgroesse() { return tankgroesse; }
    public double getTankinhalt() { return tankinhalt; }
    public int getKilometerstand() { return kilometerstand; }

    public boolean tanke(double menge) {
        boolean res = false;
        if (passtInTank(menge)) {
            tankinhalt += menge;
            res = true;
        }

        return res;
    }

    public void fahre(int strecke) {
        double verbrauch = strecke * 0.01; // Angenommen, der Roller verbraucht 1 Liter pro 100 Kilometer.
        if (tankinhalt >= verbrauch) {
            tankinhalt -= verbrauch;
            kilometerstand += strecke;
            System.out.println(strecke + "km gefahren.");
        } else {
            System.out.println("Nicht genug Treibstoff zum Fahren der gewünschten Strecke.");
        }
    }

    public boolean passtInTank(double menge) {
        boolean res = false;
        if ((tankinhalt + menge) <= tankgroesse) {
            res = true;
        }
        return res;
    }
}