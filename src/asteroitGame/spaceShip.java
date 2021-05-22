package asteroitGame;

public class spaceShip {

    private int fuel;
    private int armor;

    spaceShip() {fuel = 100; armor = 100;}

    public int getFuel() {return fuel;}

    public int getArmor() {return  armor;}

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

}
