package asteroitGame;

public class Large_ast extends Asteroit{

    public Large_ast(){
        health = 30;
        damage = 30;
        speed = 0;
        isActive=true;
        score=30;
    }//End of default constructor.


    public void print(){
        StdDraw.picture(x_cor,y_cor,"images/asteroid-large.png",0.034,0.054);
    }//End of method.
}
