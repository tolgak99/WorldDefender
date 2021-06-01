package asteroitGame;
import com.sun.source.doctree.AttributeTree; // will be check if it is necessary.

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Game {

    private int score;

    private Menu m;
    private Map map;
    private spaceShip ship;
    private Turret turret;
    private Mortar mortar;

    static int TESTBIG=0;
    static int COUNTBIG=0;


    public Menu getMenu() {
        return m;
    }

    public Map getMap() {
        return map;
    }

    public Mortar getMortar() {
        return mortar;
    }

    public Turret getTurret() {
        return turret;
    }

    public spaceShip getShip() {
        return ship;
    }


    public Game() {
        score = 0;

        TESTBIG++;
        System.out.println(" TESTBIG : "+TESTBIG);

        m = new Menu();
        map = m.getMap();
        ship = map.getShip();
        turret = new Turret();
        mortar = map.getMortar();
    }


    public static int hitAsteroid(Asteroit obj, double x, double y){
        double[] arr= obj.getCoordinates();

        if ((Math.abs(arr[0]-x)< 0.022)&& (Math.abs(arr[1]-y)<0.022) && obj.isActive){
            return obj.getDamage();
        }
        else
            return 0;
    }

    public static void main(String[] args)
    {
        int i, collision,button=KeyEvent.VK_UP;
        double x=0.5;
        double y=0.5;

        Window window = new Window();
        window.drawWindow();


        Game game;
        Map map;
        spaceShip ship;
        Turret turret;
        Mortar mortar;
        Menu m;
        ArrayList<Asteroit> Asteroits;

        //System.out.println("\n This is a test for about page");//DEBUG Purpose..
        //System.out.println("\n This page is: " + m.getMenuId());//DEBUG Purpose..




        while(true) {

            COUNTBIG++;//DEBUG Purpose..
            System.out.println("COUNTBIG : "+COUNTBIG);//DEBUG Purpose..

            game=null;
            game = new Game();



            m=game.getMenu();
            m.menu();

            map = game.getMap();
            ship = game.getShip();
            turret = game.getTurret();
            mortar = game.getMortar();


            Asteroits = map.getAsteroitsArray();

            StdDraw.enableDoubleBuffering();

            while(m.getMenuId() !=1){

            }

            x=ship.getXcoord();
            y=ship.getYcoord();

            while (m.getMenuId() == 1) {
            /*
            if(StdDraw.isMousePressed())
                System.out.println("\n Mouse_X :"+StdDraw.mouseX()+" Mouse_Y :"+StdDraw.mouseY());//DEBUG Purpose
            */

                //System.out.println("\n Out of if, test case alpha.");

                if (ship.getFuel() > 0 && ship.getArmor() > 0) {
                    //System.out.println("\n Inside of if, test case beta.");

                    if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) || StdDraw.isKeyPressed(KeyEvent.VK_A)) {
                        //StdDraw.enableDoubleBuffering();
                        button = KeyEvent.VK_LEFT;
                        x = x - 0.01;
                        ship.setXcoord(x);
                        if (ship.getXcoord() <= 0.007) {
                            x = 0.03;
                            ship.setXcoord(x);
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 90);
                            ship.getDamage(10);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(-90);
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, -90);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                            if (collision != 0) {
                                System.out.println("\n if e girdi\n");
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) || StdDraw.isKeyPressed(KeyEvent.VK_D)) {
                        //StdDraw.enableDoubleBuffering();
                        button = KeyEvent.VK_RIGHT;
                        x = x + 0.01;
                        ship.setXcoord(x);
                        if (ship.getXcoord() >= 0.985) {
                            x = 0.09;
                            ship.setXcoord(x);
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, -90);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(90);
                        /*StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.text(x, y, ">");*/
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 90);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                            if (collision != 0) {
                                System.out.println("\n if e girdi\n");
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_UP) || StdDraw.isKeyPressed(KeyEvent.VK_W)) {
                        //StdDraw.enableDoubleBuffering();
                        button = KeyEvent.VK_UP;
                        y = y + 0.01;
                        ship.setYcoord(y);
                        if (ship.getYcoord() >= 0.9851) {
                            y = 0.9;
                            ship.setYcoord(y);
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 180);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(0);
                        /*StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.text(x, y, "^");*/
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                            if (collision != 0) {
                                System.out.println("\n if e girdi\n");
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) || StdDraw.isKeyPressed(KeyEvent.VK_S)) {
                        //StdDraw.enableDoubleBuffering();
                        button = KeyEvent.VK_DOWN;
                        y = y - 0.01;
                        ship.setYcoord(y);
                        if (ship.getYcoord() <= 0.064) {
                            y = 0.06;
                            ship.setYcoord(y);
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 180);
                            ship.consumeFuel(1);
                        } else {
                            StdDraw.clear(Color.black);
                            map.printMap();
                            ship.setRotation(180);
                        /*StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.text(x, y, "v");*/
                            //StdDraw.picture(x, y, "spaceShip.png", 0.03, 0.05, 0);
                            StdDraw.show();
                            StdDraw.pause(20);
                            ship.consumeFuel(1);
                        }


                        for (i = 0; i < Asteroits.size(); i++) {
                            collision = hitAsteroid(Asteroits.get(i), x, y);
                            //System.out.println("\n collision : "+ collision);//DEBUG Purpose..
                            if (collision != 0) {
                                System.out.println("\n if e girdi\n");
                                ship.getDamage(collision);
                                Asteroits.get(i).destroyAsteroid();
                            }


                        }


                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
                        turret.fire(button, ship.getXcoord(), ship.getYcoord(), map);
                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                        mortar.fire(button, ship.getXcoord(), ship.getYcoord(), map);
                    } else if (StdDraw.isKeyPressed(KeyEvent.VK_ESCAPE)) {
                        System.out.println("In game exit scenerio.");
                        m.setClick_test(true);
                        m.setMenuId(0);
                        //m.menu();
                        break;
                    }
                } else {
                    System.out.println("Out of gas.");

                    /*
                    map = m.getMap();
                    ship = map.getShip();

                    mortar = map.getMortar();
                    */
                    m.setClick_test(true);
                    m.setMenuId(0);
                    //m.menu();
                    //game.resetGame();
                    break;
                }
            }
            map.InitializeMap_Test = true;
        }

    }

    public int getScore() {return score;}

    public void setScore (int score) {this.score = score;}

    public void increaseScore (int point) {score += point;}

    private void resetGame(){
        Game game = new Game();

        /*
        Map map = game.getMap();
        spaceShip ship = game.getShip();
        Turret turret = game.getTurret();
        Mortar mortar = game.getMortar();
        Menu m=game.getMenu();
        m.menu();
*/

        //m = new Menu();
        //turret = new Turret();
        //map.InitializeMap_Test = true;
    }

}
