package asteroitGame;

public class Medium_ast extends Asteroit{

    public Medium_ast(){
        health = 20;
        damage = 20;
        speed = 0;
    }//End of default constructor.


    public void print(){
        StdDraw.picture(x_cor,y_cor,"asteroid-medium.png",0.035,0.055);
    }//End of method.
}
