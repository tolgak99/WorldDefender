package asteroitGame;
import com.sun.source.doctree.AttributeTree; // will be check if it is necessary.

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Game {

    private static int hitAsteroid(Asteroit obj, double x, double y){
        double[] arr= obj.getCoordinates();

        if ((Math.abs(arr[0]-x)< 0.022)&& (Math.abs(arr[1]-y)<0.022) && obj.isActive){
            return obj.getDamage();
        }
        else
            return 0;
    }

    public static void main(String[] args)
    {
        int i, collision;
        double x=0.5;
        double y=0.5;

        Window window = new Window();
        window.drawWindow();

        Menu m = new Menu();
        m.menu();

        Map map = m.getMap();
        spaceShip ship = map.getShip();

        ArrayList<Asteroit> Asteroits = map.getAsteroitsArray();


        StdDraw.enableDoubleBuffering();
        while (true)
        {
            /*
            if(StdDraw.isMousePressed())
                System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
            */


            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) || StdDraw.isKeyPressed(KeyEvent.VK_A) ){
                //StdDraw.enableDoubleBuffering();
                x = x - 0.01;
                ship.setXcoord(x);
                if (ship.getXcoord() <= 0.007) {
                    x = 0.03;
                    ship.setXcoord(x);
                    StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,90);
                    ship.getDamage(10);
                }
                else {
                    StdDraw.clear(Color.black);
                    map.printMap();
                    StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, -90);
                    StdDraw.show();
                    StdDraw.pause(20);
                    ship.consumeFuel(1);
                }



                for(i=0;i<Asteroits.size();i++){
                    collision=hitAsteroid(Asteroits.get(i),x,y);
                    //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                    if (collision != 0) {
                        System.out.println("\n if e girdi\n");
                        ship.getDamage(collision);
                        Asteroits.get(i).destroyAsteroid();
                    }


                }


            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) || StdDraw.isKeyPressed(KeyEvent.VK_D) ){
                //StdDraw.enableDoubleBuffering();
                x = x + 0.01;
                ship.setXcoord(x);
                if (ship.getXcoord() >= 0.985) {
                    x = 0.09;
                    ship.setXcoord(x);
                    StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,-90);
                    ship.consumeFuel(1);
                }
                else {
                    StdDraw.clear(Color.black);
                    map.printMap();
                    /*StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.text(x, y, ">");*/
                    StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 90);
                    StdDraw.show();
                    StdDraw.pause(20);
                    ship.consumeFuel(1);
                }



                for(i=0;i<Asteroits.size();i++){
                    collision=hitAsteroid(Asteroits.get(i),x,y);
                    //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                    if (collision != 0) {
                        System.out.println("\n if e girdi\n");
                        ship.getDamage(collision);
                        Asteroits.get(i).destroyAsteroid();
                    }


                }


            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_UP) || StdDraw.isKeyPressed(KeyEvent.VK_W) ){
                //StdDraw.enableDoubleBuffering();
                y = y + 0.01;
                ship.setYcoord(y);
                if (ship.getYcoord() >= 0.9851) {
                    y = 0.9;
                    ship.setYcoord(y);
                    StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,180);
                    ship.consumeFuel(1);
                }
                else {
                    StdDraw.clear(Color.black);
                    map.printMap();
                    /*StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.text(x, y, "^");*/
                    StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05);
                    StdDraw.show();
                    StdDraw.pause(20);
                    ship.consumeFuel(1);
                }



                for(i=0;i<Asteroits.size();i++){
                    collision=hitAsteroid(Asteroits.get(i),x,y);
                    //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                    if (collision != 0) {
                        System.out.println("\n if e girdi\n");
                        ship.getDamage(collision);
                        Asteroits.get(i).destroyAsteroid();
                    }


                }


            }
            else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) || StdDraw.isKeyPressed(KeyEvent.VK_S) ){
                //StdDraw.enableDoubleBuffering();
                y = y - 0.01;
                ship.setYcoord(y);
                if (ship.getYcoord() <= 0.064) {
                    y = 0.06;
                    ship.setYcoord(y);
                    StdDraw.picture(x,y,"spaceShip.png",0.03,0.05,180);
                    ship.consumeFuel(1);
                }
                else {
                    StdDraw.clear(Color.black);
                    map.printMap();
                    /*StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.text(x, y, "v");*/
                    StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05,0);
                    StdDraw.show();
                    StdDraw.pause(20);
                    ship.consumeFuel(1);
                }



                for(i=0;i<Asteroits.size();i++){
                    collision=hitAsteroid(Asteroits.get(i),x,y);
                    //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                    if (collision != 0) {
                        System.out.println("\n if e girdi\n");
                        ship.getDamage(collision);
                        Asteroits.get(i).destroyAsteroid();
                    }


                }


            }
        }

    }
}
