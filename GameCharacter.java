public class GameCharacter {
    private String name;
    private int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHP() { return hp; }

    public void setHP(int hp) { this.hp = hp; }

    public String getName() { return name; }

    public void fight(GameCharacter other, int damageHP) {
        if (damageHP >= other.hp) {
            System.out.println(other.getName() + " ist gestorben!");
        } else {
            other.hp -= damageHP;
        }
    }

    public static void main(String[] args) {

        // Erzeugen von Objekten
        GameCharacter ratchet = new GameCharacter("Ratchet", 100);
        
        GameCharacter kratos = new GameCharacter("Kratos", 150);
        
        System.out.println(kratos.getHP()); // 150

        // "kratos" ist ein Objekt und wird als Parameter übergeben.
        ratchet.fight(kratos, 90);

        System.out.println(kratos.getHP()); // Kratos' HP ist nun 60, da 90 < 150 ist und 150-90=60 ergibt.
     }
}
