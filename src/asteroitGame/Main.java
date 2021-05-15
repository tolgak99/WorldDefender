package asteroitGame;

public class Main {

    public static void main(String[] args)
    {
        // Menu m = new Menu();
        // m.menu();

        Gun a = new Turret();
        Gun b = new Mortar();

        a.fire(1,2,3);
        b.fire(1,2,3);

    }
}
