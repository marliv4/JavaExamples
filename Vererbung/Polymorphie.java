class Tier {
    public void bewegtSich() {
        System.out.println("Das Tier bewegt sich.");
    }
}

class Vogel extends Tier {
    public void bewegtSich() {
        System.out.println("Der Vogel fliegt.");
    }
}

class Wurm extends Tier {
    public void bewegtSich() {
        System.out.println("Der Wurm kriecht.");
    }
}

public class Polymorphie {
    public static void main(String[] args) {
        Tier tier1 = new Vogel();
        Tier tier2 = new Wurm();
        tier1.bewegtSich();
        tier2.bewegtSich();
    }
}
