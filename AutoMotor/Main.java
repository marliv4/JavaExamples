public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("Mercedes", 1999, "V8", 320);
        System.out.println(a.getBaujahr());

        a.getMotor().setPs(300);
        System.out.println(a.getMotor().getPs());
    }
}