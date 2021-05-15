package asteroitGame;

public class Mortar extends Gun{
    @Override
    public void fire(int a, int b, int c) {
        System.out.println("This is a mortar!");
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }
}
