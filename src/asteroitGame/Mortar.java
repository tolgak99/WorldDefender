package asteroitGame;

public class Mortar extends Gun{
    @Override
    public void fire(int a, double b, double c, Map map) {
        System.out.println("This is a mortar!");
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }
}
