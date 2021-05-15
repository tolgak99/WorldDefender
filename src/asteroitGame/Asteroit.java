package asteroitGame;

public abstract class Asteroit {
    protected int health, damage, x_cor, y_cor;
    protected double speed;
    public int fuel_x, fuel_y;

    public Asteroit(){
        health = 0;
        damage = 0;
        speed = 0;
        x_cor = 0;
        y_cor = 0;
        fuel_x = -1;
        fuel_y = -1;
    }//End of default constructor.


    public int getDamage(){
        return damage;
    }//End of get-method.

    public int getHealth(){
        return health;
    }

    public void createFuel(){
        fuel_x = x_cor;
        fuel_y = y_cor;
    }//End of method.

    public void printFuel(){
        /*
        rlutil::setColor(8);
        rlutil::locate(fuel_x, fuel_y);
        cout << (char)232;
        rlutil::setColor(7);
        */
    }//End of method.

    public int[] getCoordinates(){
        int[] arr= new int[2];
        arr[0] = x_cor;
        arr[1] = y_cor;
        return arr;
    }//End of method.


    public void setCor(int x, int y){
        x_cor = x;
        y_cor = y;
    }
    public void setHealth(int a){
        health -= a;
    }


    //Below functions were virtual in C version.

    public void calculater(){
        //Math.random() can use here in java.
        /*
        x_cor = (rand() % 116) + 2;
        y_cor = (rand() % 27) + 2;
        */
    }//End of method.

    public abstract void print();
}
