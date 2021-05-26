package asteroitGame;

public class Small_ast extends Asteroit{

    public Small_ast() {
        health = 10;
        damage = 10;
        speed = 0;
    }//End of default constructor.


    public void print() {
        StdDraw.picture(x_cor,y_cor,"asteroid-small.png",0.032,0.052);
    }//End of method.
}
