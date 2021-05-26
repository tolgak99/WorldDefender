package asteroitGame;

public class Small_ast extends Asteroit{

    public Small_ast() {
        health = 10;
        damage = 10;
        speed = 0;
        isActive=true;
    }//End of default constructor.


    public void print() {
        StdDraw.picture(x_cor,y_cor,"asteroid-small.png",0.03,0.05);
    }//End of method.
}
