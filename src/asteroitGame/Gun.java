package asteroitGame;

public abstract class Gun {

    protected int damage;

    Gun() {}
    public abstract void fire(int a, int b, int c);
    public abstract int hitWall(int a, int b);


}
