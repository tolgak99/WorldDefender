package asteroitGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Turret extends  Gun{

    private double distance;
    private int damage;

    Turret() {distance = 0.1; damage = 10;}
    @Override
    public void fire(int a, double b, double c, Map map) {
        double i = 0.01;
        double x = b;
        double y= c;
        int collision;
        boolean test=false;

        ArrayList<Asteroit> Asteroits = map.getAsteroitsArray();

        StdDraw.enableDoubleBuffering();
        if (a == KeyEvent.VK_LEFT){
            while (i < distance)
            {
                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), x, y);
                    if (collision != 0) {
                        Asteroits.get(j).destroyAsteroid();
                        Asteroits.get(j).printFuel();
                        Game.increaseScore(Asteroits.get(j).getScore());
                        test = true;
                        break;
                    }
                }

                if (test) {
                    StdDraw.show();
                    map.printMap();
                    break;
                }
                else {
                    StdDraw.picture(x, y, "laserBullet.png", 0.1, 0.1, -90);
                    StdDraw.show();
                    StdDraw.pause(10);
                    map.printMap();
                    i += 0.01;
                    x -= 0.01;
                }
            }
        }
        else if (a == KeyEvent.VK_RIGHT){
            while (i < distance)
            {
                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), x, y);
                    if (collision != 0) {
                        Asteroits.get(j).destroyAsteroid();
                        Asteroits.get(j).printFuel();
                        Game.increaseScore(Asteroits.get(j).getScore());
                        test = true;
                        break;
                    }
                }

                if (test) {
                    StdDraw.show();
                    map.printMap();
                    break;
                }
                else {
                    StdDraw.picture(x, y, "laserBullet.png", 0.1, 0.1, -90);
                    StdDraw.show();
                    StdDraw.pause(10);
                    map.printMap();
                    i += 0.01;
                    x += 0.01;
                }
            }
        }
        else if (a == KeyEvent.VK_UP){
            while (i < distance)
            {
                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), x, y);
                    if (collision != 0) {
                        Asteroits.get(j).destroyAsteroid();
                        Asteroits.get(j).printFuel();
                        Game.increaseScore(Asteroits.get(j).getScore());
                        test = true;
                        break;
                    }
                }

                if (test) {
                    StdDraw.show();
                    map.printMap();
                    break;
                }
                else {
                    StdDraw.picture(x, y, "laserBullet.png", 0.1, 0.1, -90);
                    StdDraw.show();
                    StdDraw.pause(10);
                    map.printMap();
                    i += 0.01;
                    y += 0.01;
                }
            }
        }
        else if (a == KeyEvent.VK_DOWN){
            while (i < distance)
            {
                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), x, y);
                    if (collision != 0) {
                        Asteroits.get(j).destroyAsteroid();
                        Asteroits.get(j).printFuel();
                        Game.increaseScore(Asteroits.get(j).getScore());
                        test = true;
                        break;
                    }
                }

                if (test) {
                    StdDraw.show();
                    map.printMap();
                    break;
                }
                else {
                    StdDraw.picture(x, y, "laserBullet.png", 0.1, 0.1, -90);
                    StdDraw.show();
                    StdDraw.pause(10);
                    map.printMap();
                    i += 0.01;
                    y -= 0.01;
                }
            }
        }
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }
}
