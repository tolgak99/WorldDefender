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

        System.out.println("X: " + x + " Y: " + y);
        StdDraw.enableDoubleBuffering();
        if (a == KeyEvent.VK_LEFT){
            System.out.println("Silahlar ateşlendi 1");
            while (i < distance)
            {
                for (int j = 0; j < Asteroits.size(); j++) {
                    collision = Game.hitAsteroid(Asteroits.get(j), x, y);
                    //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                    if (collision != 0) {
                        System.out.println("\n if e girdi\n");
                        Asteroits.get(j).destroyAsteroid();
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
            System.out.println("Silahlar ateşlendi 2");
            while (i < distance)
            {
                StdDraw.picture(x + i, y, "laserBullet.png", 0.1, 0.1, 90);
                StdDraw.show();
                StdDraw.pause(10);
                map.printMap();
                i+=0.01;
            }
        }
        else if (a == KeyEvent.VK_UP){
            System.out.println("Silahlar ateşlendi 3");
            while (i < distance)
            {
                StdDraw.picture(x, y + i, "laserBullet.png", 0.1, 0.1, 0);
                StdDraw.show();
                StdDraw.pause(10);
                map.printMap();
                i+=0.01;
            }
        }
        else if (a == KeyEvent.VK_DOWN){
            System.out.println("Silahlar ateşlendi 4");
            while (i < distance)
            {
                StdDraw.picture(x , y - i, "laserBullet.png", 0.1, 0.1, 180);
                StdDraw.show();
                StdDraw.pause(10);
                map.printMap();
                i+=0.01;
            }
        }
    }

    @Override
    public int hitWall(int a, int b) {
        return 0;
    }
}
