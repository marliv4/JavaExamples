public class Suessigkeit {
    private int energie;
    private int fett;
    private int kohlenhydrate;
    private int eiweiss;
    protected double gewicht;

    public Suessigkeit(int e, int f, int k, int eiweiss, double g) {
        energie = e;
        fett = f;
        kohlenhydrate = k;
        this.eiweiss = eiweiss;
        gewicht = g;
    }

    public int getEnergie() { return energie; }
    public int getFett() { return fett; }
    public int getKohlenhydrate() { return kohlenhydrate; }
    public int getEiweiss() { return eiweiss; }
    public double getGewicht() { return gewicht; }


    public void essen(int gramm) {
        if (gewicht >= gramm) {
            double p = (double)gramm / gewicht;

            gewicht -= (double)gramm;
            energie *= p;
            fett *= p;
            kohlenhydrate *= p;
            eiweiss *= p;
        }
    }
}
