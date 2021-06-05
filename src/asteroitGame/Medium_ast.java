package asteroitGame;

public class Medium_ast extends Asteroit{

    public Medium_ast(){
        health = 20;
        damage = 20;
        speed = 0;
        isActive=true;
        score=20;
    }//End of default constructor.


    public void print(){
        StdDraw.picture(x_cor,y_cor,"asteroid-medium.png",0.033,0.053);
    }//End of method.
}
