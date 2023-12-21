public class Bonbon extends Suessigkeit {
    private String sorte;

    public Bonbon(String s, int e, int f, int k, int eiweiss, double g) {
        super(e, f, k, eiweiss, g);
        this.sorte = s;
    }

    public String getSorte() { return sorte; }

    @Override
    public void essen(int gramm) {
        super.essen((int)(gramm * 0.1));
    }
}
