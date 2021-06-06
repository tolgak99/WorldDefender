package asteroitGame;


public abstract class Gun {

    protected int damage;

    Gun() {}
    public abstract void fire(int a, double b, double c, Map map);
    public abstract int hitWall(int a, int b);


}
