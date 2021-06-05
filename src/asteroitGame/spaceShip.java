package asteroitGame;

public class spaceShip {

    private int fuel;
    private int armor;
    private double x;
    private double y;
    private int rotation;

    spaceShip() {fuel = 1000; armor = 100; x = 0.5; y = 0.5; rotation = 0;}

    public int getFuel() {return fuel;}

    public int getArmor() {return  armor;}

    public double getXcoord() {return  x;}

    public double getYcoord() {return  y;}

    public void setXcoord(double x) {this.x = x;}

    public void setYcoord(double y) {this.y= y;}

    public void setRotation (int rot) {rotation = rot;}

    public int getRotation () {return rotation;}

    public boolean getDamage(int damage) {
        if (armor <= 0)
            return  false;
        else
            armor = armor - damage;
        return  true;
    }

    public boolean consumeFuel(int amount) {
        if (fuel <= 0)
            return  false;
        else
            fuel = fuel - amount;
        return  true;
    }

    public void increaseFuel() {
            fuel += 30;
    }


}
