package asteroitGame;

public class Turret extends  Gun{
    @Override
    public void fire(int a, int b, int c) {
        System.out.println("This is a turret!");
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }
}
