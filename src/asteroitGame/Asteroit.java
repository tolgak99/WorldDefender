package asteroitGame;

import java.util.Random;

public abstract class Asteroit {
    protected double x_cor, y_cor;//Asteroit coordinates.
    private double min_x,max_x,min_y,max_y;//Asteroit creation borders.
    protected int health, damage;
    protected double speed;
    public double fuel_x, fuel_y;//will be check if it should be public or private.

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

    public double[] getCoordinates(){
        double[] arr= new double[2];
        arr[0] = x_cor;
        arr[1] = y_cor;
        return arr;
    }//End of method.


    public void setCor(double x, double y){
        x_cor = x;
        y_cor = y;
    }

    public void setHealth(int a){
        health -= a;
    }


    public void calculater(){
        Random rand = new Random();

        min_x=0.012;
        max_x=0.98;
        min_y=0.16;
        max_y=0.96;

        x_cor = min_x+(max_x-min_x)*rand.nextDouble();
        y_cor = min_y+(max_y-min_y)*rand.nextDouble();

    }//End of method.


    //Abstract function to print asteroids.
    public abstract void print();
}
