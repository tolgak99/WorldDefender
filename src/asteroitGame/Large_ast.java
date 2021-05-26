package asteroitGame;

public class Large_ast extends Asteroit{

    public Large_ast(){
        health = 30;
        damage = 30;
        speed = 0;
    }//End of default constructor.


    public void print(){
        StdDraw.picture(x_cor,y_cor,"asteroid-large.png",0.038,0.058);
    }//End of method.
}
